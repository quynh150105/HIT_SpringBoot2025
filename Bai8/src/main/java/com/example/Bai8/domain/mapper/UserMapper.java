package com.example.Bai8.domain.mapper;

import com.example.Bai8.domain.dto.request.UserRequest;
import com.example.Bai8.domain.dto.response.UserResponse;
import com.example.Bai8.domain.entity.User;
import com.example.Bai8.service.UserService;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserRequest request);

    UserResponse toUserResponse(User user);

    List<UserResponse> toUserResponseList(List<User> list);

}
