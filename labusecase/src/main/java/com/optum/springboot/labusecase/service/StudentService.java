package com.optum.springboot.labusecase.service;

import com.optum.springboot.labusecase.model.Course;
import com.optum.springboot.labusecase.model.Student;

import javax.swing.event.ListDataEvent;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    List<Course> getAllCourses();
    Student getStudentById(int studentId);
    void addCourseToStudent(int studentId, Course course);
}
