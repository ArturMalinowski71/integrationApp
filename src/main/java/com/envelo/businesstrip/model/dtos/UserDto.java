package com.envelo.businesstrip.model.dtos;

import com.envelo.businesstrip.model.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private String id;

    @NotBlank(message = "e-mail must not be blank")
    @Size(min = 2, max = 50, message = "Length of e-mail must be between 2 to 50 characters")
    private String email;

    @NotBlank(message = "First name must not be blank")
    @Size(min = 2, max = 50, message = "Length of first name must be between 2 to 50 characters")
    private String firstName;

    @NotBlank(message = "Last name must not be blank")
    @Size(min = 2, max = 50, message = "Length of last name must be between 2 to 50 characters")
    private String lastName;

    @NotBlank(message = "Department must not be blank")
    @Size(min = 2, max = 50, message = "Length of department must be between 2 to 50 characters")
    private String department;

    @NotBlank(message = "Title must not be blank")
    @Size(min = 2, max = 50, message = "Length of title must be between 2 to 50 characters")
    private String title;

    private String supervisor;

    private Set<String> subordinates;

    @NotEmpty(message = "User role must be specified")
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    public UserDto(String id, String email, String firstName, String lastName, String department, String title, String supervisor, Set<String> subordinates, Set<Role> roles) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.title = title;
        this.supervisor = supervisor;
        this.subordinates = subordinates;
        this.roles = roles;
    }
}
