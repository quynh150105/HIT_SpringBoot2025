package com.example.Bai8.repository;

import com.example.Bai8.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u WHERE u.id = ?1")
    Optional<User> findById(String id);

    @Query("SELECT u FROM User u WHERE u.userName = ?1")
    Optional<User> findByUsername(String userName);
}
