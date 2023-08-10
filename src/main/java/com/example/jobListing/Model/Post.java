package com.example.jobListing.Model;

import java.util.Arrays;

public class Post {
    private String profile;
    private String description;
    private Integer experience;
    private String technology[];

    public Post(String profile, String description, Integer experience, String[] technology) {
        this.profile = profile;
        this.description = description;
        this.experience = experience;
        this.technology = technology;
    }

    public Post() {
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String[] getTechnology() {
        return technology;
    }

    public void setTechnology(String[] technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", description='" + description + '\'' +
                ", experience=" + experience +
                ", technology=" + Arrays.toString(technology) +
                '}';
    }
}
