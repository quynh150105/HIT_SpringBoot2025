package com.example.BTVN_Buoi6.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDepartmentDTO {
    @NotBlank
    @Size(max=100)
    private String name;

    @NotBlank
    private String description;
}
