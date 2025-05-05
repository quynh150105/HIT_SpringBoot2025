package com.example.BTVN_Buoi6.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false, updatable = false, insertable = false)
    private Long id;

    @Column(name= "username", nullable = false, unique = true, length=50 )
    private String username;

    @Column(name="password", nullable = false, length=255)
    private String password;

    @Column(name="email", nullable = false, unique = true, length=100)
    private String email;

    @Column(name="createAt")
    private LocalDateTime createAt;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Employees> list = new ArrayList<>();
}
