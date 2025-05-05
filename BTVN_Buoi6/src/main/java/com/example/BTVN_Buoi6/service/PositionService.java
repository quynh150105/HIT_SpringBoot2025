package com.example.BTVN_Buoi6.service;

import com.example.BTVN_Buoi6.domain.dto.request.RequestPositionDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponsePositionDTO;

import java.util.List;

public interface PositionService {
    ResponsePositionDTO createPosition(RequestPositionDTO requestPositionDTO);

    List<ResponsePositionDTO> getAllPosition();

    ResponsePositionDTO updatePosition(Long id, RequestPositionDTO requestPositionDTO);

    ResponsePositionDTO deletePosition(Long id);

}
