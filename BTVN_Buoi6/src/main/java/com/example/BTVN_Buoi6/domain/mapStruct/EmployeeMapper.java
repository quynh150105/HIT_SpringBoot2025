package com.example.BTVN_Buoi6.domain.mapstruct;

import com.example.BTVN_Buoi6.domain.dto.request.RequestEmployeesDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseEmployeeDTO;
import com.example.BTVN_Buoi6.domain.entity.Employees;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mapping(target = "department", ignore = true)
    @Mapping(target = "position", ignore = true)
    @Mapping(target = "user", ignore = true)
    Employees toEmployee(RequestEmployeesDTO requestEmployeesDTO);

    // Dữ liệu từ Entity -> DTO: map thủ công id của các đối tượng liên kết
    @Mapping(target = "department_id", source = "department.id")
    @Mapping(target = "positions_id", source = "position.id")
    @Mapping(target = "user_id", source = "user.id")
    ResponseEmployeeDTO toResponseEmployeeDTO(Employees employees);

    List<ResponseEmployeeDTO> toResponseEmployeeDTOList(List<Employees> employeesList);




}
