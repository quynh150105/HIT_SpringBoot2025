package com.example.BTVN_Buoi6.domain.mapstruct;

import com.example.BTVN_Buoi6.domain.dto.request.RequestPositionDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponsePositionDTO;
import com.example.BTVN_Buoi6.domain.entity.Positions;
import org.apache.coyote.Request;
import org.aspectj.weaver.Position;
import org.mapstruct.Mapper;
import java.util.*;

@Mapper(componentModel = "spring")
public interface PositionMapper {
    Positions toPosition(RequestPositionDTO requestPositionDTO);

    ResponsePositionDTO toResponsePositionDTO(Positions position);

    List<ResponsePositionDTO> toResponsePositionDTOList(List<Positions> positionList);
}
