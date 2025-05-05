package com.example.BTVN_Buoi6.service;

import com.example.BTVN_Buoi6.domain.dto.request.RequestUserDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseUserDTO;

import java.util.List;

public interface UserService {
    ResponseUserDTO createUser(RequestUserDTO requestUserDTO);

    List<ResponseUserDTO> getAllUser();

    ResponseUserDTO deleteUser(Long id);

    ResponseUserDTO updateUser(Long id, RequestUserDTO requestUserDTO);
}
