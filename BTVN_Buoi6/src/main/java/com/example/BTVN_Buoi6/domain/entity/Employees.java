package com.example.BTVN_Buoi6.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name= "full_name", nullable = false, length = 100)
    private String fullName;

    @Column(name= "date_of_birth")
    private LocalDateTime dob;

    @Column(name= "hired_date")
    private LocalDateTime hiredDate;

    @Column(name= "salary", precision = 10, scale = 2)
    private BigDecimal salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name="positions_id")
    private Positions position;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;



}
