package com.example.BTVN_Buoi6.controller;

import com.example.BTVN_Buoi6.domain.dto.request.RequestDepartmentDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseDepartmentDTO;
import com.example.BTVN_Buoi6.service.DepartmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService service;

    @PostMapping("/create")
    public ResponseEntity<?> createDepartment(@RequestBody RequestDepartmentDTO departmentDTO){
        service.createDepartment(departmentDTO);
        return ResponseEntity.ok("create department successful");
    }

    @GetMapping("/getAll")
    public List<ResponseDepartmentDTO> getAll(){
        return service.getAllDepartment();
    }

    @DeleteMapping("/delete/{departmentId}")
    public ResponseEntity<?> deleteDepartment(@PathVariable("departmentId") Long id){
        service.deleteDepartment(id);
        return ResponseEntity.ok("delete thanh cong");
    }

    @PutMapping("/update/{departmentId}")
    public ResponseEntity<?> updateDepartment(@PathVariable("departmentId") Long id, @Valid @RequestBody RequestDepartmentDTO departmentDTO){
        service.updateDepartment(id,departmentDTO);

        return ResponseEntity.ok("update thang cong");
    }
}
