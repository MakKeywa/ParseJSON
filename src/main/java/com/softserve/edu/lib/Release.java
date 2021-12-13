package com.softserve.edu.lib;

import java.util.Arrays;

public class Release {
    private String name;
    private String length;
    private String startDateOffset;
    private Sprint[] sprints;

    public Release(String name, String length, String startDateOffset, Sprint[] sprints) {
        this.name = name;
        this.length = length;
        this.startDateOffset = startDateOffset;
        this.sprints = sprints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(String startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    public Sprint[] getSprints() {
        return sprints;
    }

    public void setSprints(Sprint[] sprints) {
        this.sprints = sprints;
    }

    @Override
    public String toString() {
        return "Release{" + "\n" +
                "name='" + name + '\'' + "\n" +
                ", length='" + length + '\'' + "\n" +
                ", startDateOffset='" + startDateOffset + '\'' + "\n" +
                ", sprints=" + Arrays.toString(sprints) + "\n" +
                '}';
    }
}
