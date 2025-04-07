package com.example.BTVN_Buoi4.service.impl;

import com.example.BTVN_Buoi4.entity.Classes;
import com.example.BTVN_Buoi4.entity.Students;
import com.example.BTVN_Buoi4.repository.ClassesRepository;
import com.example.BTVN_Buoi4.service.ClassService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassService {

    private final ClassesRepository repository;

    public ClassesServiceImpl(ClassesRepository repository){
        this.repository = repository;
    }


    @Override
    public List<Classes> getAllClass() {
        return repository.findAll();
    }

    @Override
    public void createClass(Classes classes) {
        repository.save(classes);
    }

    @Override
    public void deleteStudent(Classes classes) {
        repository.delete(classes);
    }
}
