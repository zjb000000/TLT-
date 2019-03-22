package com.gg.tlt.model;


public class Profession {

    public Profession(String jobTitle, Integer numberOfPeople) {
        this.jobTitle = jobTitle;
        this.numberOfPeople = numberOfPeople;
    }

    Integer numberOfPeople;
    String educationNeeded;

    public Profession( String jobTitle,String educationNeeded, Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
        this.educationNeeded = educationNeeded;
        this.jobTitle = jobTitle;
    }

    public Profession(String jobTitle, Integer minSalary, Integer maxSalary, Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
        this.jobTitle = jobTitle;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    String jobTitle;
    Integer maxSalary;
    Integer minSalary;
    Integer experienceYear;


    public Profession(String jobTitle, Integer maxSalary, Integer minSalary, Integer experienceYear, String educationNeeded, String province) {
        this.jobTitle = jobTitle;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
        this.experienceYear = experienceYear;
        this.educationNeeded = educationNeeded;
        this.province = province;
    }



    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }



    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    String province;



    public String getEducationNeeded() {
        return educationNeeded;
    }

    public void setEducationNeeded(String educationNeeded) {
        this.educationNeeded = educationNeeded;
    }

    public Profession() {
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Integer maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Integer getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Integer minSalary) {
        this.minSalary = minSalary;
    }

    public Integer getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(Integer experienceYear) {
        this.experienceYear = experienceYear;
    }
}