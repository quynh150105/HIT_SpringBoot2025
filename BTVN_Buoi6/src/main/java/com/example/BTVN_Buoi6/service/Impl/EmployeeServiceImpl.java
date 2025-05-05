package com.example.BTVN_Buoi6.service.impl;

import com.example.BTVN_Buoi6.domain.dto.request.RequestEmployeesDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseEmployeeDTO;
import com.example.BTVN_Buoi6.domain.entity.Department;
import com.example.BTVN_Buoi6.domain.entity.Employees;
import com.example.BTVN_Buoi6.domain.entity.Positions;
import com.example.BTVN_Buoi6.domain.entity.User;
import com.example.BTVN_Buoi6.domain.mapstruct.EmployeeMapper;
import com.example.BTVN_Buoi6.repository.DepartmentRepository;
import com.example.BTVN_Buoi6.repository.EmployeesRepository;
import com.example.BTVN_Buoi6.repository.PositionRepository;
import com.example.BTVN_Buoi6.repository.UserRepository;
import com.example.BTVN_Buoi6.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeesRepository employeesRepository;
    private final DepartmentRepository departmentRepository;
    private final UserRepository userRepository;
    private final PositionRepository positionRepository;
    private final EmployeeMapper mapper;

    @Override
    public ResponseEmployeeDTO createEmployee(RequestEmployeesDTO requestEmployeesDTO) {
        Employees employees = mapper.toEmployee(requestEmployeesDTO);

        Department department = departmentRepository.findById(requestEmployeesDTO.getDepartment_id())
                .orElseThrow(() -> new RuntimeException("Không tìm thấy phòng ban"));
        Positions position = positionRepository.findById(requestEmployeesDTO.getPositions_id())
                .orElseThrow(() -> new RuntimeException("Không tìm thấy vị trí"));
        User user = userRepository.findById(requestEmployeesDTO.getUser_id())
                .orElseThrow(() -> new RuntimeException("Không tìm thấy user"));

        employees.setDepartment(department);
        employees.setPosition(position);
        employees.setUser(user);

        Employees saved = employeesRepository.save(employees);
        return mapper.toResponseEmployeeDTO(saved);
    }

    @Override
    public List<ResponseEmployeeDTO> getAllEmployees() {
        return mapper.toResponseEmployeeDTOList(employeesRepository.findAll());
    }

    @Override
    public ResponseEmployeeDTO updateEmployee(Long id, RequestEmployeesDTO requestEmployeesDTO) {
        Employees employees = employeesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy nhân viên"));

        employees.setDob(requestEmployeesDTO.getDob());
        employees.setFullName(requestEmployeesDTO.getFullName());
        employees.setSalary(requestEmployeesDTO.getSalary());
        employees.setHiredDate(requestEmployeesDTO.getHiredDate());

        Department department = departmentRepository.findById(requestEmployeesDTO.getDepartment_id())
                .orElseThrow(() -> new RuntimeException("Không tìm thấy phòng ban"));
        Positions position = positionRepository.findById(requestEmployeesDTO.getPositions_id())
                .orElseThrow(() -> new RuntimeException("Không tìm thấy vị trí"));
        User user = userRepository.findById(requestEmployeesDTO.getUser_id())
                .orElseThrow(() -> new RuntimeException("Không tìm thấy user"));

        employees.setDepartment(department);
        employees.setPosition(position);
        employees.setUser(user);

        employeesRepository.save(employees);
        return mapper.toResponseEmployeeDTO(employees);
    }

    @Override
    public ResponseEmployeeDTO deleteEmployee(Long id) {
        Employees employees = employeesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy nhân viên"));

        employeesRepository.delete(employees);
        return mapper.toResponseEmployeeDTO(employees);
    }

    @Override
    public ResponseEmployeeDTO getEmployeesByfullName(String name) {
        Employees employees = employeesRepository.findByFullName(name);
        return mapper.toResponseEmployeeDTO(employees);
    }

    @Override
    public List<ResponseEmployeeDTO> getEmployeeByDepartmentId(Long department_id) {
        List<Employees> employees = employeesRepository.findByDepartment_Id(department_id);
        return mapper.toResponseEmployeeDTOList(employees);
    }

    @Override
    public List<ResponseEmployeeDTO> getEmployeeByPositionId(Long position_id) {
        List<Employees> employees = employeesRepository.findByPosition_Id(position_id);
        return mapper.toResponseEmployeeDTOList(employees);
    }
}
