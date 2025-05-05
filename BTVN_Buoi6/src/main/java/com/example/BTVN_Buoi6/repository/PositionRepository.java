package com.example.BTVN_Buoi6.repository;

import com.example.BTVN_Buoi6.domain.entity.Positions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Positions,Long > {
}
