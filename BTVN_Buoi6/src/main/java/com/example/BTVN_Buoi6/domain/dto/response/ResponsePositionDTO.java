package com.example.BTVN_Buoi6.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponsePositionDTO {

    private Long id;

    private String title;

    private String description;
}
