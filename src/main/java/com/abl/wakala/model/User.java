package com.abl.wakala.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "USER_NAME"))
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "USER_NAME")
    private String username;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "MSISDN")
    private Long msisdn;
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "ROLE_ID")
    private Role roleName;

    public User() {
    }
    public User(String fullName, String username, String email, String password, Long msisdn, Role roleName) {

        this.fullName = fullName;

        this.username = username;

        this.email = email;

        this.password = password;

        this.msisdn = msisdn;

        this.roleName = roleName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMsisdn(Long msisdn) {
        this.msisdn = msisdn;
    }

    public Role getRole() {return roleName;}

    public void setRole(Role roleName) {this.roleName = roleName;}
}
