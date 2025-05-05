package com.example.BTVN_Buoi6.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEmployeeDTO {
    private Long id;

    private String fullName;

    private LocalDateTime dob;

    private LocalDateTime hiredDate;

    private BigDecimal salary;

    private Long department_id;

    private Long user_id;

    private Long positions_id;
}
