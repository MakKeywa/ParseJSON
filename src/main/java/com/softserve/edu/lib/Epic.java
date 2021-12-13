package com.softserve.edu.lib;

import java.util.Arrays;

public class Epic {
    String name;
    String description;
    int sSize;
    int startdateOffset;
    String[] releases;

    public Epic(String name, String description, int sSize, int startdateOffset, String[] releases) {
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

    public String[] getReleases() {
        return releases;
    }

    public void setReleases(String[] releases) {
        this.releases = releases;
    }

    @Override
    public String toString() {
        return "Epic{" + "\n" +
                "name='" + name + '\'' + "\n" +
                ", description='" + description + '\'' + "\n" +
                ", sSize=" + sSize + "\n" +
                ", startdateOffset=" + startdateOffset + "\n" +
                ", releases=" + Arrays.toString(releases) + "\n" +
                '}';
    }
}
