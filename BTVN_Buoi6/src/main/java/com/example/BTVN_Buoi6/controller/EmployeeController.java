package com.example.BTVN_Buoi6.controller;

import com.example.BTVN_Buoi6.domain.dto.request.RequestEmployeesDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseEmployeeDTO;
import com.example.BTVN_Buoi6.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService service;

    @PostMapping("/create")
    public ResponseEntity<?> createEmployee(@Valid @RequestBody RequestEmployeesDTO requestEmployeesDTO){
        service.createEmployee(requestEmployeesDTO);
        return ResponseEntity.ok("create thanh cong");
    }

    @GetMapping("/getAll")
    public List<ResponseEmployeeDTO> getAll(){
        return service.getAllEmployees();
    }

    @DeleteMapping("/delete/{employeeId}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("employeeId") Long id){
        service.deleteEmployee(id);
        return ResponseEntity.ok("delete thanh cong");
    }

    @PutMapping("/update/{employeeId}")
    public ResponseEntity<?> updateEmployee(@PathVariable("employeeId") Long id, @Valid @RequestBody RequestEmployeesDTO requestEmployeesDTO){
        service.updateEmployee(id,requestEmployeesDTO);
        return ResponseEntity.ok("update thanh cong");
    }

    @GetMapping("/search/departmentId/{departmentId}")
    public List<ResponseEmployeeDTO> getByDepartmentID(@PathVariable("departmentId") Long id){
        return service.getEmployeeByDepartmentId(id);
    }

    @GetMapping("/search/fullName/{name}")
    public ResponseEmployeeDTO getByName(@PathVariable("name") String  name){
        return service.getEmployeesByfullName(name);
    }


    @GetMapping("/search/positionId/{positionId}")
    public List<ResponseEmployeeDTO> getByPositionId(@PathVariable("positionId") Long id){
        return service.getEmployeeByPositionId(id);
    }




}
