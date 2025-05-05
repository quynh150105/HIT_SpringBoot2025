package com.example.BTVN_Buoi6.domain.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestEmployeesDTO {
    @NotBlank
    private String fullName;

    private LocalDateTime dob;

    private LocalDateTime hiredDate;

    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal salary;

    private Long department_id;

    private Long positions_id;

    private Long user_id;

}
