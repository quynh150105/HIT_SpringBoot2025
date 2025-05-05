package com.example.BTVN_Buoi6.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestPositionDTO {

    @NotBlank
    private String title;

    private String description;
}
