package com.example.BTVN_Buoi4.controller;

import com.example.BTVN_Buoi4.entity.Students;
import com.example.BTVN_Buoi4.repository.StudentRepository;
import com.example.BTVN_Buoi4.service.StudentService;
import com.example.BTVN_Buoi4.service.impl.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;
    private final StudentRepository repository;

    public StudentController(StudentService service,StudentRepository repository){
        this.service = service;
        this.repository = repository;
    }

    @GetMapping("/getAll")
    public List<Students> getAllStudents(){
        return service.getAllStudent();
    }

    @GetMapping("/{id}")
    public Students getStudentById(@PathVariable int id){
        return service.getStudents(id);
    }

    @PostMapping("/create")
    public String createStudents(@RequestBody Students students){
        service.createStudent(students);
        return "them thanh cong";
    }

    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Students students){
        Students updateStudent = repository.findById(id);
        service.updateStudent(updateStudent);
        return "update thanh cong";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
        return "xoa thanh cong";
    }




}
