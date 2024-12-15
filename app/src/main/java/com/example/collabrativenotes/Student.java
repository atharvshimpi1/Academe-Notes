package com.example.collabrativenotes;

public class Student {
    private String name;
    private String sapId; // Changed sapId to string
    private int year;
    private String branch;
    private String profilePictureUrl;

    // Constructor
    public Student(String name, String sapId, int year, String branch, String profilePictureUrl) {
        this.name = name;
        this.sapId = sapId;
        this.year = year;
        this.branch = branch;
        this.profilePictureUrl = profilePictureUrl;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSapId() { // Changed return type to String
        return sapId;
    }

    public void setSapId(String sapId) { // Changed parameter type to String
        this.sapId = sapId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }
}
