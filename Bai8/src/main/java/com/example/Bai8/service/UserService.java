package com.example.Bai8.service;

import com.example.Bai8.domain.dto.request.UserRequest;
import com.example.Bai8.domain.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse registration(UserRequest request);

    List<UserResponse> getAll();
    UserResponse login(UserRequest request);
}
