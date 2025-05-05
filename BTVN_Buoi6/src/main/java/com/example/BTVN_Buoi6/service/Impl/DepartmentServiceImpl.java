package com.example.BTVN_Buoi6.service.impl;

import com.example.BTVN_Buoi6.domain.dto.request.RequestDepartmentDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseDepartmentDTO;
import com.example.BTVN_Buoi6.domain.entity.Department;
import com.example.BTVN_Buoi6.domain.mapstruct.DepartmentMapper;
import com.example.BTVN_Buoi6.repository.DepartmentRepository;
import com.example.BTVN_Buoi6.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;
    private final DepartmentMapper mapper;

    // them
    @Override
    public ResponseDepartmentDTO createDepartment(RequestDepartmentDTO departmentDTO) {
        Department department = mapper.toDepartment(departmentDTO);
        Department saveDepartment = repository.save(department);
        return mapper.toResponseDepartmentDTO(saveDepartment);
    }

    // lay tat ca
    @Override
    public List<ResponseDepartmentDTO> getAllDepartment() {
        List<Department> list = repository.findAll();
        return mapper.toResponseDepartmentDTOList(list);
    }

    // sua theo id
    @Override
    public ResponseDepartmentDTO updateDepartment(Long id, RequestDepartmentDTO departmentDTO) {
        Department department = repository.getById(id);
        department.setName(departmentDTO.getName());
        department.setDescription((departmentDTO.getDescription()));
        repository.save(department);
        return mapper.toResponseDepartmentDTO(department);
    }

    // xoa theo id
    @Override
    public ResponseDepartmentDTO deleteDepartment(Long id) {
        Department department = repository.getById(id);
        repository.delete(department);
        return mapper.toResponseDepartmentDTO(department);
    }
}
