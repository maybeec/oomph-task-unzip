package com.github.maybeec.oomph.task.unzip.core.impl;

import com.github.maybeec.oomph.task.unzip.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.unzip.core.UnzipUtil;
import com.github.maybeec.oomph.task.unzip.core.exceptions.UnsupportedFileTypeException;
import com.github.maybeec.oomph.task.unzip.core.exceptions.UnzipTaskException;

import org.codehaus.plexus.archiver.UnArchiver;
import org.codehaus.plexus.archiver.tar.TarGZipUnArchiver;
import org.codehaus.plexus.archiver.zip.ZipUnArchiver;

import java.io.File;

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

    UnArchiver unarchiver = getUnArchiver(zipFile);
    unarchiver.setDestFile(new File(zipFile));
    unarchiver.setDestDirectory(new File(destDir));

    try
    {
      unarchiver.extract();
    }
    catch (Exception e)
    {
      throw new UnzipTaskException("Could not unzip properly: " + e.getMessage(), e);
    }

  }

  private UnArchiver getUnArchiver(String zipFile) throws UnsupportedFileTypeException
  {
    String fileExtension = "undefined";
    try
    {
      int lastDot = zipFile.lastIndexOf('.');
      fileExtension = zipFile.substring(lastDot + 1);
    }
    catch (IllegalArgumentException e)
    {
      throw new UnsupportedFileTypeException("Could not find an unarchiver for file type " + fileExtension, e);
    }
    if (fileExtension.equals("gz"))
    {
      return new TarGZipUnArchiver();
    }
    else
    {
      if (!fileExtension.equals("zip"))
      {
        SetupTaskLogger.getLogger().logWarning("Could not find Unarchiver for " + fileExtension + " ! Trying Zip Unarchiver. ");
      }
      return new ZipUnArchiver();
    }
  }

}
