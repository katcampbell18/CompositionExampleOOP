/*Create an Education class and make an instance of the Education class a member of the Person class.
Your education class should include a list of last 10 schools attended.
Create a toString() override for both Job and Education that outputs the information in the class to the console.
The toString() override for Person should use the toString() methods for the Job and Education member objects.*/

package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Education {
    private ArrayList<String> schools;

    public Education(){
        schools = new ArrayList<>();
    }

    public void setSchools(){
        Collections.addAll(schools, "Howard", "Georgetown", "Georgia Tech", "Brwn Mayr", "Montgomery College", "UMD", "Johns Hopkins", "American", "Catholic", "GW");
    }

    public ArrayList<String> getSchools(){
        return schools;
    }

    @Override
    public String toString(){
        String str = "";
        str = str.join(" University, ", schools);
        return str;
    }
}
