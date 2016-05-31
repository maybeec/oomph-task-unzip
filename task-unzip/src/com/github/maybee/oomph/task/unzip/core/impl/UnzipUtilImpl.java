package com.github.maybee.oomph.task.unzip.core.impl;

import java.io.File;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.progress.ProgressMonitor;

import com.github.maybee.oomph.task.unzip.core.SetupTaskLogger;
import com.github.maybee.oomph.task.unzip.core.UnzipUtil;

/**
 * @author sholzer
 *
 */
public class UnzipUtilImpl extends UnzipUtil {

    @Override
    public void unzip(String zipFile, String destDir) {
        SetupTaskLogger.getLogger().logInfo("Starting Unzip process");
        SetupTaskLogger.getLogger().log("Archive: " + zipFile);
        SetupTaskLogger.getLogger().log("Destination: " + destDir);

        ZipFile zip;
        try {
            zip = new ZipFile(new File(zipFile));
        } catch (Exception ex) {
            SetupTaskLogger.getLogger().logError(ex.getMessage());
            return;
        }
        ProgressMonitor progress = zip.getProgressMonitor();

        UnzipThread unzipThread = new UnzipThread(zip, destDir);
        unzipThread.run();
        while (unzipThread.isAlive()) {
            SetupTaskLogger.getLogger().log("unziped: " + progress.getPercentDone() + "%");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        SetupTaskLogger.getLogger().logInfo("Unzipping done");
    }

}

class UnzipThread extends Thread {

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
    UnzipThread(ZipFile zip, String destination) {
        this.zip = zip;
        this.destination = destination;
    }

    /**
     * {@inheritDoc}
     * @author sholzer (Feb 10, 2016)
     */
    @Override
    public void run() {
        try {
            zip.extractAll(destination);
        } catch (Exception e) {
            error = true;
            errorMessage = e.getMessage();
        }
    }

}
