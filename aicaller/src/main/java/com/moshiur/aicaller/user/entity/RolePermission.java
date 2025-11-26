package com.moshiur.aicaller.user.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "rolepermission")
public class RolePermission {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String feature;
    private boolean canView;
    private boolean canAdd;
    private boolean canUpdate;
    private boolean canDelete;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
    // getters/setters
}

