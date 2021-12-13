package com.softserve.edu.lib;

import java.util.Arrays;

public class Project {
    String name;
    String releaseGroup;
    ReportFile[] reportFiles;
    Project[] childProjects;
    RootCause[] rootCauses;
    Epic[] epics;

    public Project(String name, String releaseGroup, ReportFile[] reportFiles, Project[] childProjects, RootCause[] rootCauses, Epic[] epics) {
        this.name = name;
        this.releaseGroup = releaseGroup;
        this.reportFiles = reportFiles;
        this.childProjects = childProjects;
        this.rootCauses = rootCauses;
        this.epics = epics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseGroup() {
        return releaseGroup;
    }

    public void setReleaseGroup(String releaseGroup) {
        this.releaseGroup = releaseGroup;
    }

    public ReportFile[] getReportFiles() {
        return reportFiles;
    }

    public void setReportFiles(ReportFile[] reportFiles) {
        this.reportFiles = reportFiles;
    }

    public Project[] getChildProjects() {
        return childProjects;
    }

    public void setChildProjects(Project[] childProjects) {
        this.childProjects = childProjects;
    }

    public RootCause[] getRootCauses() {
        return rootCauses;
    }

    public void setRootCauses(RootCause[] rootCauses) {
        this.rootCauses = rootCauses;
    }

    public Epic[] getEpics() {
        return epics;
    }

    public void setEpics(Epic[] epics) {
        this.epics = epics;
    }

    @Override
    public String toString() {
        return "Project{" + "\n" +
                "name='" + name + '\'' + "\n" +
                ", releaseGroup=" + releaseGroup + "\n" +
                ", reportFiles=" + Arrays.toString(reportFiles) + "\n" +
                ", childProjects=" + Arrays.toString(childProjects) + "\n" +
                ", rootCauses=" + Arrays.toString(rootCauses) + "\n" +
                ", epics=" + Arrays.toString(epics) + "\n" +
                '}';
    }
}
