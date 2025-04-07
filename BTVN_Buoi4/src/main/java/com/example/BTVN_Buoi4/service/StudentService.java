package com.example.BTVN_Buoi4.service;

import com.example.BTVN_Buoi4.entity.Students;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface StudentService {
    List<Students> getAllStudent();

    Students getStudents(int id);

    void createStudent(Students students);

    void updateStudent(Students students);

    void deleteStudent(int id);
//
//    Students searchById(int id);
//
//    List<Students> searchByName(String name);
//
//    List<Students> searchByClassId(Class classId);

}
