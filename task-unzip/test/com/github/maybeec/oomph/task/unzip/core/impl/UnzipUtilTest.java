package com.github.maybeec.oomph.task.unzip.core.impl;

import static org.junit.Assert.assertTrue;

import com.github.maybeec.oomph.task.unzip.core.UnzipUtil;
import com.github.maybeec.oomph.task.unzip.core.exceptions.UnzipTaskException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 *
 * @author sholzer (14.10.2016)
 */
public class UnzipUtilTest
{
  public static String resourceFolder = "./test/resources/";

  public static String destination = resourceFolder + "dest";

  public static File dest = new File(destination);

  UnzipUtil util;

  @Before
  public void before()
  {
    util = new UnzipUtilImpl();
  }

  @Test
  public void testZip() throws UnzipTaskException
  {
    String zipFileName = resourceFolder + "zipfile.zip";
    util.unzip(zipFileName, destination);
    File[] files = dest.listFiles();
    boolean zippedExtracted = false;
    boolean zippedCopyExtracted = false;
    for (File f : files)
    {
      if (f.getName().equals("zipped.txt"))
      {
        zippedExtracted = true;
      }
      if (f.getName().equals("zipped - Copy.txt"))
      {
        zippedCopyExtracted = true;
      }
    }
    assertTrue("zipped.txt not extracted", zippedExtracted);
    assertTrue("zipped - Copy.txt not extracted", zippedCopyExtracted);
  }

  @Test
  public void testTarGZ() throws Exception
  {
    String tarGzFileName = resourceFolder + "tarfile.tar.gz";
    util.unzip(tarGzFileName, destination);
    File[] files = dest.listFiles();
    boolean taredExtracted = false;
    boolean taredCopyExtracted = false;
    for (File f : files)
    {
      if (f.getName().equals("tared.txt"))
      {
        taredExtracted = true;
      }
      if (f.getName().equals("tared - Copy.txt"))
      {
        taredCopyExtracted = true;
      }
    }
    assertTrue("tared.txt not extracted", taredExtracted);
    assertTrue("tared - Copy.txt not extracted", taredCopyExtracted);
  }

  @AfterClass
  public static void afterAll()
  {

    for (File f : dest.listFiles())
    {
      if (f.isFile())
      {
        f.delete();
      }
    }
  }

}
