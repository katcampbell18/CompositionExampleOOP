package com.company;

import java.util.ArrayList;

public class Person {
    //composition has-a relationship
    private Job job;

    private Education education;

    public Person(){
        this.job = new Job();
        job.setSalary(1000L);

        this.education = new Education();
        education.setSchools();
    }

    public long getSalary() {
        return job.getSalary();
    }

    public ArrayList<String> getSchools(){
        return education.getSchools();
    }

    @Override
    public String toString(){
        return "Job information: \n" + job.toString() +
                "\nSchool information: \n" + education.toString();

    }
}
