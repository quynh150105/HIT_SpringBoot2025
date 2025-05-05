package com.example.BTVN_Buoi6.controller;

import com.example.BTVN_Buoi6.domain.dto.request.RequestUserDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseUserDTO;
import com.example.BTVN_Buoi6.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@Valid @RequestBody RequestUserDTO userDTO){
        service.createUser(userDTO);
        return ResponseEntity.ok("create successfull");
    }

    @GetMapping("/getAll")
    public List<ResponseUserDTO> getAllUser(){
        service.getAllUser();
        return service.getAllUser();
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable("userId") Long id){
        service.deleteUser(id);
        return ResponseEntity.ok("xoa thanh cong");
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<?> updateUser(@PathVariable("userId") Long id,@Valid @RequestBody RequestUserDTO requestUserDTO){
        service.updateUser(id,requestUserDTO);
        return ResponseEntity.ok("update thanh cong");
    }

}
