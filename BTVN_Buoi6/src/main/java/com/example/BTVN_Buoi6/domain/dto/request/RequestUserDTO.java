package com.example.BTVN_Buoi6.domain.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestUserDTO {

    @NotBlank(message = "username khong duoc de trong")
    private String username;

    @NotBlank(message = "password khong duoc de trong")
    private String password;

    @NotBlank(message = "email khong duoc de trong")
    @Email
    private String email;

    private LocalDateTime createAt;
}
