package com.example.BTVN_Buoi4.controller;

import com.example.BTVN_Buoi4.entity.Classes;
import com.example.BTVN_Buoi4.repository.ClassesRepository;
import com.example.BTVN_Buoi4.service.ClassService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {

    private final ClassService service;
    private final ClassesRepository repository;

    public ClassController(ClassService service, ClassesRepository repository){
        this.service = service;
        this.repository = repository;
    }

    @GetMapping("/getAll")
    public List<Classes> getAllClasses(){
        return service.getAllClass();
    }

    @PostMapping("/create")
    public ResponseEntity<Classes> createClass(@RequestBody Classes classes) {
        if (classes.getName() == null || classes.getName().isEmpty()) {
            throw new RuntimeException("Class name is required!");
        }
        Classes newClass = repository.save(classes);
        return ResponseEntity.status(HttpStatus.CREATED).body(newClass);
    }

}
