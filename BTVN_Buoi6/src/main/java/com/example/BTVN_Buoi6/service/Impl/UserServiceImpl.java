package com.example.BTVN_Buoi6.service.impl;

import com.example.BTVN_Buoi6.domain.dto.request.RequestUserDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponseUserDTO;
import com.example.BTVN_Buoi6.domain.entity.User;
import com.example.BTVN_Buoi6.domain.mapstruct.UserMapper;
import com.example.BTVN_Buoi6.repository.UserRepository;
import com.example.BTVN_Buoi6.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository repository;
    private final UserMapper userMapper;

    // create 1 user
    @Override
    public ResponseUserDTO createUser(RequestUserDTO requestUserDTO) {
        if(requestUserDTO.getCreateAt()==null){
            requestUserDTO.setCreateAt(LocalDateTime.now());
        }
        User user = userMapper.toUser(requestUserDTO);
        User saveUser = repository.save(user);
        return userMapper.toResponseUserDTO(saveUser);
    }

    // getAll users
    @Override
    public List<ResponseUserDTO> getAllUser() {
        List<User> list = repository.findAll();
        return userMapper.toResponceUserDTOList(list);
    }

    // delete
    @Override
    public ResponseUserDTO deleteUser(Long id) {
        User user = repository.getById(id);
        repository.delete(user);
        return userMapper.toResponseUserDTO(user);
    }

    // update
    @Override
    public ResponseUserDTO updateUser(Long id, RequestUserDTO requestUserDTO) {
        User user = repository.getById(id);
        user.setPassword(requestUserDTO.getPassword());
        user.setEmail(requestUserDTO.getEmail());
        user.setCreateAt(LocalDateTime.now());
        repository.save(user);
        return userMapper.toResponseUserDTO(user);
    }


}
