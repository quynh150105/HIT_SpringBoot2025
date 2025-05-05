package com.example.BTVN_Buoi6.service;

import com.example.BTVN_Buoi6.domain.dto.request.RequestEmployeesDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseEmployeeDTO;

import java.util.List;

public interface EmployeeService {
    ResponseEmployeeDTO createEmployee(RequestEmployeesDTO requestEmployeesDTO);

    List<ResponseEmployeeDTO> getAllEmployees();

    ResponseEmployeeDTO updateEmployee(Long id, RequestEmployeesDTO requestEmployeesDTO);

    ResponseEmployeeDTO deleteEmployee(Long id);

    ResponseEmployeeDTO getEmployeesByfullName(String name);

    List<ResponseEmployeeDTO> getEmployeeByDepartmentId(Long department_id);

    List<ResponseEmployeeDTO> getEmployeeByPositionId(Long position_id);
}
