package com.moshiur.aicaller.user.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy="role", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RolePermission> permissions = new ArrayList<>();
    // getters/setters
}