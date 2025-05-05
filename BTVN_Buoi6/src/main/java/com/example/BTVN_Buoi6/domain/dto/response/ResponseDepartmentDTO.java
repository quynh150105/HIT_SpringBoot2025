package com.example.BTVN_Buoi6.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDepartmentDTO {
    private Long id;

    private String name;

    private String description;
}
