package com.company;

public class Main { // refactor to CompositionBasics

    public static void main(String[] args) {
        Person tom = new Person();

        System.out.println(tom.getSalary());
        System.out.println(tom.getSchools()+"\n");

        System.out.println(tom.toString());

    }
}
