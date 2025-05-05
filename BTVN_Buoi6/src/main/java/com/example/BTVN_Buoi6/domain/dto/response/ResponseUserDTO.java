package com.example.BTVN_Buoi6.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUserDTO {
    private Long id;

    private String username;

    private String email;

    private LocalDateTime createAt;
}
