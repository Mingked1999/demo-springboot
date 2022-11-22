package com.java.mingke.demo.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Double gpa;
    //constructor without attribute
    public Student(){

    }
    //constructor with all attributes
    public Student(Long id, String name, String email, LocalDate dob, Double gpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.gpa = gpa;
    }
    //constructor without attribute id
    public Student(String name, String email, LocalDate dob, Double gpa) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.gpa = gpa;
    }

    /**
     * getters
     */
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Double getGpa() {
        return gpa;
    }

    /**
     * setters
     */
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", gpa=" + gpa +
                '}';
    }
}
