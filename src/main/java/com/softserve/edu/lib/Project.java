package com.softserve.edu.lib;

public class Project {
    String name;
    ReleaseGroup releaseGroup;
    ReportFile[] reportFiles;
    Project[] childProjects;
    RootCause[] rootCauses;
    Epic[] epics;

    public Project(String name, ReleaseGroup releaseGroup, ReportFile[] reportFiles, Project[] childProjects, RootCause[] rootCauses, Epic[] epics) {
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

    public ReleaseGroup getReleaseGroup() {
        return releaseGroup;
    }

    public void setReleaseGroup(ReleaseGroup releaseGroup) {
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
}
