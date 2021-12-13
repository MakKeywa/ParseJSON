package com.softserve.edu.lib;

public class Company {
    private ReleaseGroup[] releaseGroups;
    private Project[] projects;

    public Company(ReleaseGroup[] releaseGroups, Project[] projects) {
        this.releaseGroups = releaseGroups;
        this.projects = projects;
    }

    public ReleaseGroup[] getReleaseGroups() {
        return releaseGroups;
    }

    public void setReleaseGroups(ReleaseGroup[] releaseGroups) {
        this.releaseGroups = releaseGroups;
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }
}
