package org.spring.btvn_buoi3.Service.impl;

import org.spring.btvn_buoi3.Entity.Student;
import org.spring.btvn_buoi3.Repository.StudentRepository;
import org.spring.btvn_buoi3.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> selectAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(Long id, Student student) {
        Student student1 = studentRepository.findById(id).orElse(null);
        if(student1 != null) {
            student1.setName(student.getName());
            student1.setEmail(student.getEmail());
            student1.setPhone(student.getPhone());
            student1.setAddress(student.getAddress());
            studentRepository.save(student1);
        }
    }
}
