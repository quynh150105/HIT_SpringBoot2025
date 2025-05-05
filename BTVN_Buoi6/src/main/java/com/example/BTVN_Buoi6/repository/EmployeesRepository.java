package com.example.BTVN_Buoi6.repository;

import com.example.BTVN_Buoi6.domain.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Long> {
    Employees findByFullName(String fullName);

    List<Employees> findByDepartment_Id(Long departmentId);
    List<Employees> findByPosition_Id(Long positionId);
}
