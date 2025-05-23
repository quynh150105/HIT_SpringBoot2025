package com.example.Bai8.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;

    private String userName;

    private String passWord;

    private String firstName;

    private String lastName;
}
