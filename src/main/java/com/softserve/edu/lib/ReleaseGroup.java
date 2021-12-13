package com.softserve.edu.lib;

public class ReleaseGroup {
    private String name;
    private Release[] releases;

    public ReleaseGroup(String name, Release[] releases) {
        this.name = name;
        this.releases = releases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Release[] getReleases() {
        return releases;
    }

    public void setReleases(Release[] releases) {
        this.releases = releases;
    }
}
