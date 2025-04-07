package com.example.BTVN_Buoi4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="classes")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "class_id", nullable = false)
    private int id;

    @Column(name = "class_name", nullable = false)
    private String name;

    @Column(name = "class_subject", nullable = false)
    private String subject;

    @OneToMany(mappedBy = "classEntity", cascade = CascadeType.ALL)
    private List<Students> danhSachSinhVien = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public List<Students> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void setDanhSachSinhVien(List<Students> danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }
}
