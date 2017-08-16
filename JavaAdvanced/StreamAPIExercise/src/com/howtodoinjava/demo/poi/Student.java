package com.howtodoinjava.demo.poi;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Lenovo on 10.2.2017 г..
 */
public class Student {

    private String facultyNumber;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int group;
    private ArrayList<Integer> grades;
    private String phone;

    public String getFacultyNumber() {return facultyNumber;}

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getEmail() {return email;}

    public int getAge() {return age;}

    public int getGroup() {return group;}

    public List<Integer> getGrades() {return Collections.unmodifiableList(grades);}

    public String getPhone() {return phone;}

    public Student(String facultyNumber, String firstName, String lastName, String email, int age, int group, String phone, ArrayList<Integer> grades) {
        this.facultyNumber = facultyNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.group = group;
        this.grades = grades;
        this.phone = phone;
    }
}