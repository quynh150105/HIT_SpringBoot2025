package com.example.BTVN_Buoi6.repository;

import com.example.BTVN_Buoi6.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
