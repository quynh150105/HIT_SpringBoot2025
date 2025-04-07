package com.example.BTVN_Buoi4.service;

import com.example.BTVN_Buoi4.entity.Classes;
import com.example.BTVN_Buoi4.entity.Students;

import java.util.List;

public interface ClassService {
    List<Classes> getAllClass();

    void createClass(Classes classes);

    void deleteStudent(Classes classes);
}
