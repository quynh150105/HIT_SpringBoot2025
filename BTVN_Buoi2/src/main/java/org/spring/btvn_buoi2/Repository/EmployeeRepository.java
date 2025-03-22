package org.spring.btvn_buoi2.Repository;

import org.spring.btvn_buoi2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    List<Employee> id(String id);
}
