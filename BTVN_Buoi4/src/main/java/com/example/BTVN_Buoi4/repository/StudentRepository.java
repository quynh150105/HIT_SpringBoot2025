package com.example.BTVN_Buoi4.repository;

import com.example.BTVN_Buoi4.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students,Integer> {
   Students findById(int id);
//    List<Students> findByName(String name);
//    List<Students> findByClassId(Class class_id);
}
