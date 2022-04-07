package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.enums.Role;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
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

    @Builder.Default @ElementCollection(fetch = FetchType.LAZY)
    private Set<String> subordinates = new HashSet<>();

    @Builder.Default @ElementCollection(fetch = FetchType.LAZY)
    @Column(nullable=false)
    @Enumerated (EnumType.STRING)
    private Set<Role> roles = new HashSet<>();
}
