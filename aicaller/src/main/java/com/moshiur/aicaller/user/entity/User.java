package com.moshiur.aicaller.user.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password; // store bcrypt hash
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
