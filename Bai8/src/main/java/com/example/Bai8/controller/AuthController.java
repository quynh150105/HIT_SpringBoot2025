package com.example.Bai8.controller;

import com.example.Bai8.domain.dto.request.UserRequest;
import com.example.Bai8.domain.dto.response.ApiResponse;
import com.example.Bai8.domain.dto.response.UserResponse;
import com.example.Bai8.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService service;

    @PostMapping("/registration")
    public ResponseEntity<ApiResponse<?>> regis(@Valid @RequestBody UserRequest request){
        return ResponseEntity.ok(
                ApiResponse.<UserResponse>builder()
                        .message("create thanh cong")
                        .data(service.registration(request))
                        .status(HttpStatus.CREATED)
                        .build()
        );
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<?>> login(@RequestBody UserRequest request){
        return ResponseEntity.ok(
                ApiResponse.<UserResponse>builder()
                        .message("login thanh cong")
                        .status(HttpStatus.OK)
                        .data(service.login(request))
                        .build()
        );
    }

}
