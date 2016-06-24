package com.github.maybeec.oomph.task.unzip.core.impl;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.progress.ProgressMonitor;

import com.github.maybeec.oomph.task.unzip.core.SetupTaskLogger;
import com.github.maybeec.oomph.task.unzip.core.UnzipUtil;
import com.github.maybeec.oomph.task.unzip.core.exceptions.UnzipTaskException;

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

    ZipFile zip;
    try
    {
      zip = new ZipFile(new File(zipFile));
    }
    catch (Exception ex)
    {
      throw new UnzipTaskException("Encountered problems :" + ex.getMessage());
    }
    try
    {
      zip.setRunInThread(true);
      ProgressMonitor progress = zip.getProgressMonitor();
      zip.extractAll(destDir);
      while (progress.getState() == ProgressMonitor.STATE_BUSY)
      {
        SetupTaskLogger.getLogger().log(progress.getPercentDone() + " percent done");
        try
        {
          Thread.sleep(500);
        }
        catch (Exception e)
        {
        }
      }
    }
    catch (Exception e)
    {
      throw new UnzipTaskException("Could not unzip properly: " + e.getMessage());
    }

  }

}

class UnzipThread extends Thread
{

  /**
   * zip4j api
   */
  ZipFile zip;

  /**
   * destination directory
   */
  String destination;

  /**
   * if something went wrong. Since I cannot throw exceptions through the runnable interface I used this
   * work around
   */
  boolean error = false;

  /**
   * What went wrong
   */
  String errorMessage;

  /**
   * Constructor
   * @param zip
   *            the zip4j api obj
   * @param destination
   *            destination directory
   * @author sholzer (Feb 10, 2016)
   */
  UnzipThread(ZipFile zip, String destination)
  {
    this.zip = zip;
    this.destination = destination;
  }

  /**
   * {@inheritDoc}
   * @author sholzer (Feb 10, 2016)
   */
  @Override
  public void run()
  {

  }

}
