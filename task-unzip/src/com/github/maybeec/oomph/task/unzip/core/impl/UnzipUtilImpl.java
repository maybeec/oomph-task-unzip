package com.github.maybeec.oomph.task.unzip.core.impl;

import com.github.maybeec.oomph.task.unzip.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.unzip.core.UnzipUtil;
import com.github.maybeec.oomph.task.unzip.core.exceptions.UnzipTaskException;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;
import org.apache.commons.compress.utils.IOUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author sholzer
 *
 */
public class UnzipUtilImpl extends UnzipUtil
{

  @Override
  public void unzip(String zipFile, String destDir) throws UnzipTaskException
  {
    SetupTaskLogger.getLogger().logInfo("Starting Unzip process");
    SetupTaskLogger.getLogger().log("Archive: " + zipFile);
    SetupTaskLogger.getLogger().log("Destination: " + destDir);

    File file = new File(zipFile);
    try
    {
      InputStream fileIS = new BufferedInputStream(new FileInputStream(file));
      switch (archiveType(file.getName()))
      {
      case UNKNOWN:
        SetupTaskLogger.getLogger().logWarning("Unknown archive extension of " + file.getName() + ". Trying nevertheless");
        //$FALL-THROUGH$
      case COMPRESSED:
        SetupTaskLogger.getLogger().log("Decompressing Archive");
        BufferedInputStream in = new BufferedInputStream(fileIS);
        CompressorInputStream cIS = new CompressorStreamFactory().createCompressorInputStream(in);
        File tempFile = File.createTempFile(file.getName(), ".decompressed");
        OutputStream os = new FileOutputStream(tempFile);
        final byte[] buffer = new byte[256];
        int n = 0;
        while (-1 != (n = cIS.read(buffer)))
        {
          os.write(buffer, 0, n);
        }
        os.close();
        cIS.close();
        fileIS.close();
        SetupTaskLogger.getLogger().log("Decompressing done");
        fileIS = new BufferedInputStream(new FileInputStream(tempFile));
        //$FALL-THROUGH$
      case ARCHIVE:
        SetupTaskLogger.getLogger().log("Unarchiving");
        ArchiveInputStream archiveIS = new ArchiveStreamFactory().createArchiveInputStream(fileIS);
        ArchiveEntry entry;
        while ((entry = archiveIS.getNextEntry()) != null)
        {
          SetupTaskLogger.getLogger().log("Extracting " + entry.getName());
          OutputStream out = new FileOutputStream(new File(destDir, entry.getName()));
          IOUtils.copy(archiveIS, out);
          out.flush();
          out.close();
        }
        archiveIS.close();
        SetupTaskLogger.getLogger().logInfo("Done");
      }
    }
    catch (Exception ex)
    {
      throw new UnzipTaskException(ex);
    }

  }

  private ArchiveType archiveType(String fileName)
  {
    int lastDotPosition = fileName.lastIndexOf('.');
    if (lastDotPosition == -1)
    {
      return ArchiveType.UNKNOWN;
    }
    String ending = fileName.substring(lastDotPosition + 1);

    if (ending.equals("zip") || ending.equals("cpio") || ending.equals("ar") || ending.equals("tar") || ending.equals("jar") || ending.equals("dump")
        || ending.equals("7z") || ending.equals("arj"))
    {
      return ArchiveType.ARCHIVE;
    }
    if (ending.equals("bz2") || ending.equals("lzma") || ending.equals("xz") || ending.equals("pack200") || ending.equals("z") || ending.equals("gz"))
    {
      return ArchiveType.COMPRESSED;
    }
    return ArchiveType.UNKNOWN;

  }

  enum ArchiveType
  {
    ARCHIVE, COMPRESSED, UNKNOWN
  }

}
