package org.spring.btvn_buoi2.Service;

import org.spring.btvn_buoi2.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface EmployeeService {
    Employee createEmployee(Employee employee);

    List<Employee> getEmployees();

    Employee updateEmployee(Employee employee);

    void deleteEmployee(String id);


}
