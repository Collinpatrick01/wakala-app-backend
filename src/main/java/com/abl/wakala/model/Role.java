package com.abl.wakala.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "role")
public class Role {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_ID")
    private  Long id;
    @Column(name = "ROLE_NAME")
    private String roleName;

    public Role(){

    }
    public Role(String roleName) {
        this.roleName = roleName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return roleName;
    }

    public void setName(String roleName) {
        this.roleName = roleName;
    }
}
