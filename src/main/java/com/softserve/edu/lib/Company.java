package com.softserve.edu.lib;

import java.util.Arrays;

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

    @Override
    public String toString() {
        return "Company{" + "\n" +
                "releaseGroups=" + Arrays.toString(releaseGroups) + "\n" +
                ", projects=" + Arrays.toString(projects) + "\n" +
                '}';
    }
}
