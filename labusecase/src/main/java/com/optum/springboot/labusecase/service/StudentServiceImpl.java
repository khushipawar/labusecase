package com.optum.springboot.labusecase.service;

import com.optum.springboot.labusecase.model.Course;
import com.optum.springboot.labusecase.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;

@Service
public class StudentServiceImpl  implements  StudentService{
    private List<Student> students;
    private List<Course> courses;

    public StudentServiceImpl()
    {
        students = new ArrayList<>();
        courses = new ArrayList<>();

        Course course1 = new Course(1,"Course 1");
        Course course2 = new Course(2,"Course 2");
        courses.add(course1);
        courses.add(course2);

        Student student1 = new Student(1,"Khushi Pawar", new ArrayList<>());
        student1.getCourse().add(course1);
        students.add(student1);

        Student student2 = new Student(2,"Akriti Singh",new ArrayList<>());
        student2.getCourse().add(course1);
        student2.getCourse().add(course2);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
//        for(int i = 0; i < students.size(); i++) {
//            System.out.print(students.get(i));
//        }

        return students;
    }

    @Override
    public Student getStudentById(int studentId) {
        return students.stream().filter(student -> student.getId() == studentId).findFirst().orElse(null);

    }

    @Override
    public void addCourseToStudent(int studentId, Course course) {
        Student student= getStudentById(studentId);
        if(student != null)
        {
            student.getCourse().add(course);
        }

    }

    @Override
    public List<Course>getAllCourses()
    {

        return courses;
    }


}
