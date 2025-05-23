package com.example.Bai8.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserRequest {

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{5,20}$")
    private String userName;

    @NotBlank
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,}$")
    private String passWord;

    @NotBlank(message="firstName is not blank")
    private String firstName;

    @NotBlank(message="lastName is not blank")
    private String lastName;
}
