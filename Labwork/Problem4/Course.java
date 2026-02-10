package Labwork.Problem4;

import java.util.ArrayList;

public class Course {

    private String name;
    private String description;
    private int creditNum;
    private ArrayList<String> prereqs;

    public Course(String subjectName, String subjectDescription, int subjectCreditNum, ArrayList<String> subjectPrereq) {
        this.name = subjectName;
        this.description = subjectDescription;
        this.creditNum = subjectCreditNum;
        this.prereqs = subjectPrereq;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course name: " + name +
                ", Description: " + description +
                ", Credits: " + creditNum +
                ", Prerequisites: " + prereqs;
    }
}