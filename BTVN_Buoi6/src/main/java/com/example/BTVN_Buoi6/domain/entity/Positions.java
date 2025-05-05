package com.example.BTVN_Buoi6.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="position")
public class Positions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id")
    private Long id;

    @Column(name="title", nullable = false, length= 100, unique = true)
    private String title;

    @Column(name="description")
    private String description;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private List<Employees> list = new ArrayList<>();
}
