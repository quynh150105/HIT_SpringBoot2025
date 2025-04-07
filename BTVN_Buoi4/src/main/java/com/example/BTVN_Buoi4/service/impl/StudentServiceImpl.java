package com.example.BTVN_Buoi4.service.impl;

import com.example.BTVN_Buoi4.entity.Students;
import com.example.BTVN_Buoi4.repository.StudentRepository;
import com.example.BTVN_Buoi4.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository){
        this.repository = repository;
    }

    @Override
    public List<Students> getAllStudent() {
        return repository.findAll();
    }

    @Override
    public Students getStudents(int id) {
        return repository.findById(id);
    }

    @Override
    public void createStudent(Students students) {
        repository.save(students);
    }

    @Override
    public void updateStudent(Students students) {
        Students updateStudent = repository.findById(students.getId());
        if(updateStudent != null){
            updateStudent.setName(students.getName());
            updateStudent.setDob(students.getDob());
            updateStudent.setGender(students.getGender());
            updateStudent.setEmail(students.getEmail());
            updateStudent.setPhone(students.getPhone());
            updateStudent.setclassEntity(students.getclassEntity());
            repository.save(updateStudent);
        }
        else{
            throw new RuntimeException("khong tim thay sinh vien nay!");
        }
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteById(id);
    }
//
//    @Override
//    public Students searchById(int id) {
//        return repository.findById(id);
//    }
//
//    @Override
//    public List<Students> searchByName(String name) {
//        return repository.findByName(name);
//    }
//
//    @Override
//    public List<Students> searchByClassId(Class class_id) {
//        return repository.findByClassId(class_id);
//    }
}
