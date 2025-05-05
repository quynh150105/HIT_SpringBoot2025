package com.example.BTVN_Buoi6.controller;

import com.example.BTVN_Buoi6.domain.dto.request.RequestPositionDTO;
import com.example.BTVN_Buoi6.domain.dto.response.ResponsePositionDTO;
import com.example.BTVN_Buoi6.service.PositionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/positions")
@RequiredArgsConstructor
public class PositionController {
    private final PositionService service;

    @PostMapping("/create")
    public ResponseEntity<?> createPosition(@Valid @RequestBody RequestPositionDTO positionDTO){
        service.createPosition(positionDTO);
        return ResponseEntity.ok("create thanh cong");
    }

    @GetMapping("/getAll")
    public List<ResponsePositionDTO> getAll(){
        return service.getAllPosition();
    }

    @PutMapping("/update/{positionId}")
    public ResponseEntity<?>  updatePosition(@Valid @RequestBody RequestPositionDTO requestPositionDTO, @PathVariable("positionId") Long id){
        service.updatePosition(id, requestPositionDTO);
        return ResponseEntity.ok("update Thanh cong");
    }

    @DeleteMapping("/delete/{positionId}")
    public ResponseEntity<?> deletePosition(@PathVariable("positionId") Long id){
        service.deletePosition(id);
        return ResponseEntity.ok("delete thanh cong");
    }


}
