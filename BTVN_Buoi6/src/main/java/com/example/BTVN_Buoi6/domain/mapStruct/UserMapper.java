package com.example.BTVN_Buoi6.domain.mapstruct;

import com.example.BTVN_Buoi6.domain.dto.request.RequestUserDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseUserDTO;
import com.example.BTVN_Buoi6.domain.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(RequestUserDTO requestUserDTO); // nhan vao request(nhan vao dto chuyen ve entity)

    ResponseUserDTO toResponseUserDTO(User user); // tra ra response (lay tu entity tra ra dto)

    List<ResponseUserDTO> toResponceUserDTOList(List<User> userList); // tra ra danh sach (lay tu entity tra ra dto) response
}
