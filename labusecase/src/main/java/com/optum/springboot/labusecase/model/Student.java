package com.optum.springboot.labusecase.model;

import java.util.List;

public class Student {
    public <T> Student(int i, String khushi_pawar, List<T> asList) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private List<Course> course;
}
