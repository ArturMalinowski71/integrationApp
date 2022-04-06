package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class User {
    @Id
    private String id;

    @Column(nullable=false)
    private String email;

    @Column(nullable=false)
    private String firstName;

    @Column(nullable=false)
    private String lastName;

    @Column(nullable=false)
    private String department;

    @Column(nullable=false)
    private String title;

    private  String supervisor;

    private Set<String> subordinates;

    @Enumerated (EnumType.STRING)
    private Set<Role> roles;
}
