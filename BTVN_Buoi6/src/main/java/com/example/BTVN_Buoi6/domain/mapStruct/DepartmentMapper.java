package com.example.BTVN_Buoi6.domain.mapstruct;

import com.example.BTVN_Buoi6.domain.dto.request.RequestDepartmentDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseDepartmentDTO;
import com.example.BTVN_Buoi6.domain.entity.Department;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
    Department toDepartment(RequestDepartmentDTO departmentDTO);

    ResponseDepartmentDTO toResponseDepartmentDTO(Department department);

    List<ResponseDepartmentDTO> toResponseDepartmentDTOList(List<Department> departmentList);
}
