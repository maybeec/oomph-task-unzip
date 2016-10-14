package com.github.maybeec.oomph.task.unzip.core.impl;

import com.github.maybeec.oomph.task.unzip.core.UnzipUtil;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author sholzer (14.10.2016)
 */
public class UnzipUtilTest
{
  String resourceFolder = "./test/resources/";

  String tarGzFileName = resourceFolder + "tar.tar.gz";

  UnzipUtil util;

  @Before
  public void before()
  {
    util = new UnzipUtilImpl();
  }

  @Test
  public void testZip()
  {
    String zipFileName = resourceFolder + "zip.zip";

  }

  public void testTarGZ() throws Exception
  {

  }

}
