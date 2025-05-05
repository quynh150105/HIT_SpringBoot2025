package com.example.BTVN_Buoi6.service.impl;

import com.example.BTVN_Buoi6.domain.dto.request.RequestPositionDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponsePositionDTO;
import com.example.BTVN_Buoi6.domain.entity.Positions;
import com.example.BTVN_Buoi6.domain.mapstruct.PositionMapper;
import com.example.BTVN_Buoi6.repository.PositionRepository;
import com.example.BTVN_Buoi6.service.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {

    private final PositionRepository repository;
    private final PositionMapper mapper;

    @Override
    public ResponsePositionDTO createPosition(RequestPositionDTO requestPositionDTO) {
        Positions position = mapper.toPosition(requestPositionDTO);
        Positions savePositions = repository.save(position);
        return mapper.toResponsePositionDTO(savePositions);
    }

    @Override
    public List<ResponsePositionDTO> getAllPosition() {
        return mapper.toResponsePositionDTOList(repository.findAll());
    }

    @Override
    public ResponsePositionDTO updatePosition(Long id, RequestPositionDTO requestPositionDTO) {
        Positions position = repository.getReferenceById(id);
        position.setTitle(requestPositionDTO.getTitle());
        position.setDescription(requestPositionDTO.getDescription());
        repository.save(position);
        return mapper.toResponsePositionDTO(position);
    }

    @Override
    public ResponsePositionDTO deletePosition(Long id) {
        Positions ps = repository.getById(id);
        repository.delete(ps);
        return mapper.toResponsePositionDTO(ps);
    }
}
