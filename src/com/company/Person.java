package com.company;

import java.util.ArrayList;

public class Person {
    //composition has-a relationship
    private Job job;

    private Education education;

    // Constructor
    public Person() {
        this.job = new Job();
        job.setSalary(50000L); // This means every Person object will have a default salary of 50,000
        job.setRole("Web developer");

        this.education = new Education();

    }

    //Overloaded Constructor
    public Person(long salary) {
        this.job = new Job();
        job.setSalary(salary);
    }

    // Methods
    public long getSalary() {
        return job.getSalary();
    }

    @Override
    public String toString() {
        return job.toString() + "\n" + education.toString();
    }


    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }
}
