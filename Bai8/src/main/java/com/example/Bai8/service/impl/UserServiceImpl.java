package com.example.Bai8.service.impl;

import com.example.Bai8.domain.dto.request.UserRequest;
import com.example.Bai8.domain.dto.response.UserResponse;
import com.example.Bai8.domain.entity.User;
import com.example.Bai8.domain.mapper.UserMapper;
import com.example.Bai8.repository.UserRepository;
import com.example.Bai8.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper mapper;
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public UserResponse registration(UserRequest request) {

        if(repository.findByUsername(request.getUserName()).isPresent()){
            throw new RuntimeException("User already exit");
        }
        User user = mapper.toUser(request);
        user.setPassWord(passwordEncoder.encode(user.getPassWord()));
        User saveUser = repository.save(user);
        return mapper.toUserResponse(saveUser);
    }

    @Override
    public List<UserResponse> getAll() {
        List<User> allUses = repository.findAll();
        return mapper.toUserResponseList(allUses);
    }

    @Override
    public UserResponse login(UserRequest request) {
        User user = repository.findByUsername(request.getUserName())
                .orElseThrow(()-> new RuntimeException("User not found"));

        if(!passwordEncoder.matches(request.getPassWord(), user.getPassWord())){
            throw new RuntimeException("Invalid password");
        }

        return mapper.toUserResponse(user);
    }
}
