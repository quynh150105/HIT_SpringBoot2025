package com.example.BTVN_Buoi6.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name= "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",insertable = false, updatable = false)
    private Long id;

    @Column(name="name", unique = true, length=100)
    private String name;

    @Column(name="description")
    private String description;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employees> list = new ArrayList<>();
}
