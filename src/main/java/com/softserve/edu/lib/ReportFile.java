package com.softserve.edu.lib;

public class ReportFile {
    private String fileLocation;
    private int startDateOffset;

    public ReportFile(String fileLocation, int startDateOffset) {
        this.fileLocation = fileLocation;
        this.startDateOffset = startDateOffset;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public int getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(int startDateOffset) {
        this.startDateOffset = startDateOffset;
    }
}
