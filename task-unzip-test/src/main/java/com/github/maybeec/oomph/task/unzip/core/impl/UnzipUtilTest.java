package com.github.maybeec.oomph.task.unzip.core.impl;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import com.github.maybeec.oomph.task.unzip.core.UnzipUtil;
import com.github.maybeec.oomph.task.unzip.core.exceptions.UnzipTaskException;

/**
 *
 * @author sholzer (14.10.2016)
 */
public class UnzipUtilTest {

    public static String resourceFolder = "src/main/resources/";

    public static String destination = resourceFolder + "dest";

    public static File dest = new File(destination);

    private UnzipUtil util;

    @Before
    public void before() {
        util = new UnzipUtilImpl();
    }

    @Test
    public void testZip() throws UnzipTaskException {
        String zipFileName = resourceFolder + "zipfile.zip";
        util.unzip(zipFileName, destination);
        File[] files = dest.listFiles();
        boolean zippedExtracted = false;
        boolean zippedCopyExtracted = false;
        for (File f : files) {
            if (f.getName().equals("zipped.txt")) {
                zippedExtracted = true;
            }
            if (f.getName().equals("zipped - Copy.txt")) {
                zippedCopyExtracted = true;
            }
        }
        assertTrue("zipped.txt not extracted", zippedExtracted);
        assertTrue("zipped - Copy.txt not extracted", zippedCopyExtracted);
    }

    @Test
    public void testTarGZ() throws Exception {
        String tarGzFileName = resourceFolder + "tarfile.tar.gz";
        util.unzip(tarGzFileName, destination);
        File[] files = dest.listFiles();
        boolean taredExtracted = false;
        boolean taredCopyExtracted = false;
        for (File f : files) {
            if (f.getName().equals("tared.txt")) {
                taredExtracted = true;
            }
            if (f.getName().equals("tared - Copy.txt")) {
                taredCopyExtracted = true;
            }
        }
        assertTrue("tared.txt not extracted", taredExtracted);
        assertTrue("tared - Copy.txt not extracted", taredCopyExtracted);
    }

    @Test
    public void testNestedFiles() throws Exception {
        String nestedFolders = resourceFolder + "nested.tar";
        util.unzip(nestedFolders, destination);
        boolean firstLvlFolder = false;
        boolean secondLvlFolder = false;
        boolean secondLvlFile = false;
        boolean thirdLvlFile = false;

        for (File f : dest.listFiles()) {
            if (f.isDirectory() && f.getName().equals("New folder")) {
                firstLvlFolder = true;
                for (File ff : f.listFiles()) {
                    if (ff.isDirectory() && ff.getName().equals("New folder")) {
                        secondLvlFolder = true;
                        for (File fff : ff.listFiles()) {
                            if (fff.getName().equals("test.txt")) {
                                thirdLvlFile = true;
                            }
                        }
                    }
                    if (ff.isFile() && ff.getName().equals("test.txt")) {
                        secondLvlFile = true;
                    }
                }
            }
        }

        assertTrue("Problems in the first lvl", firstLvlFolder);
        assertTrue("Problems in the second lvl", secondLvlFile && secondLvlFolder);
        assertTrue("Problems in the third lvl", thirdLvlFile);

    }

    @Test
    public void testFirstDataInFolder() throws Exception {
        String zipFile = resourceFolder + "data.zip";
        util.unzip(zipFile, destination);

        boolean aExists = new File(destination + "/elasticsearch-2.3.0/README.textile").exists();

        assertTrue("File not found", aExists);
    }

    @AfterClass
    public static void afterAll() {

        for (File f : dest.listFiles()) {
            if (f.isFile()) {
                f.delete();
            } else {
                deleteFolder(f);
            }
        }
    }

    public static void deleteFolder(File f) {
        for (File ff : f.listFiles()) {
            if (ff.isDirectory()) {
                deleteFolder(ff);
            }
            ff.delete();
        }
        f.delete();
    }
}
