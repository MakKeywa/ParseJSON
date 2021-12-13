package com.softserve.edu.lib;

public class Epic {
    String name;
    String description;
    int sSize;
    int startdateOffset;
    Release[] releases;

    public Epic(String name, String description, int sSize, int startdateOffset, Release[] releases) {
        this.name = name;
        this.description = description;
        this.sSize = sSize;
        this.startdateOffset = startdateOffset;
        this.releases = releases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getsSize() {
        return sSize;
    }

    public void setsSize(int sSize) {
        this.sSize = sSize;
    }

    public int getStartdateOffset() {
        return startdateOffset;
    }

    public void setStartdateOffset(int startdateOffset) {
        this.startdateOffset = startdateOffset;
    }

    public Release[] getReleases() {
        return releases;
    }

    public void setReleases(Release[] releases) {
        this.releases = releases;
    }
}
