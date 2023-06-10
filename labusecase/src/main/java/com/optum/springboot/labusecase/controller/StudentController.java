package com.optum.springboot.labusecase.controller;

import com.optum.springboot.labusecase.model.Course;
import com.optum.springboot.labusecase.model.Student;
import com.optum.springboot.labusecase.service.StudentService;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentServices;

    public StudentController(StudentService studentService)
    {
        this.studentServices = studentService;

    }
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentServices.getAllStudents();

    }
    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable int studentId)
    {
        return studentServices.getStudentById(studentId);

    }
    @GetMapping("/courses")
public List<Course> getAllCourses()
{
    return studentServices.getAllCourses();
}

@PostMapping("/{studentId}/courses")
    public void addCourseToStudent(
            @PathVariable int studentId,
            @RequestBody Course course
)
{
    studentServices.addCourseToStudent(studentId,course);
}


}
