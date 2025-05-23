package com.example.Bai8.controller;

import com.example.Bai8.domain.dto.response.ApiResponse;
import com.example.Bai8.domain.dto.response.UserResponse;
import com.example.Bai8.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/getAlls")
    public ResponseEntity<ApiResponse<List<UserResponse>>> getAll(){
        List<UserResponse> list = service.getAll();
        return ResponseEntity.ok(
                ApiResponse.<List<UserResponse>>builder()
                        .message("list User")
                        .status(HttpStatus.OK)
                        .data(list)
                        .build()
        );
    }
}
