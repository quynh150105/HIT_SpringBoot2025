package org.spring.btvn_buoi3.Service;

import org.spring.btvn_buoi3.Entity.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student student);
    List<Student> selectAllStudents();
    void deleteStudent(Long id);
    void updateStudent(Long id, Student student);
}
