package com.example.Bai8.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(insertable = false)
    private String id;


    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    @JsonIgnore
    private String passWord;

    @Nationalized
    @Column(nullable = false)
    private String firstName;

    @Nationalized
    @Column(nullable = false)
    private String lastName;

}
