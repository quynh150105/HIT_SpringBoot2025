package com.example.BTVN_Buoi6.service;

import com.example.BTVN_Buoi6.domain.dto.request.RequestDepartmentDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseDepartmentDTO;
import com.example.BTVN_Buoi6.domain.entity.Department;

import java.util.List;

public interface DepartmentService {
    ResponseDepartmentDTO createDepartment(RequestDepartmentDTO departmentDTO);

    List<ResponseDepartmentDTO> getAllDepartment();

    ResponseDepartmentDTO updateDepartment(Long id, RequestDepartmentDTO departmentDTO);

    ResponseDepartmentDTO deleteDepartment(Long id);
}
