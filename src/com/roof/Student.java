package com.roof;

import java.util.List;

public class Student {

    // instance variables (state)
    private String fullname;
    private int age; // default --> 0
    private int schoolNumber;

    // constructor
    public Student(String fullname) {
        this.fullname = fullname;
    }

    public Student() {
    }


    // methods (behavior)
    public void enrollCourse(String courseName) {

    }

    // getters&setters
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 50) {
            System.out.println("The age is not valid...");
        } else {
            this.age = age;
        }
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    @Override
    public String toString() {
        return "Student's age  is " +  this.getAge() + " and name is " + this.getFullname();
    }
}

class TestClass {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAge(18);
        student1.setFullname("Ali Veli");
        System.out.println("Student :" + student1);
        System.out.println("Age :" + student1.getAge());
        System.out.println("Name :" + student1.getFullname());
    }
}
