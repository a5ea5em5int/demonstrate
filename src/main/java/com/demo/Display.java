package com.demo;

public class Display {
    String name;
    String job;
    String rollno;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getRollno() {
        return rollno;
    }

    public Display(String name, String job, String rollno) {
        this.name = name;
        this.job = job;
        this.rollno = rollno;
    }
}
