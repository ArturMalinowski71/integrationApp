package com.envelo.businesstrip.model.dtos;

import com.envelo.businesstrip.model.enums.Role;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UserDto {
    private String id;

    @NotBlank(message = "e-mail must not be blank")
    @Size(min = 2, max = 50, message = "Length of e-mail must be between {min} to {max} characters")
    private String email;

    @NotBlank(message = "First name must not be blank")
    @Size(min = 2, max = 50, message = "Length of first name must be between {min} to {max} characters")
    private String firstName;

    @NotBlank(message = "Last name must not be blank")
    @Size(min = 2, max = 50, message = "Length of last name must be between {min} to {max} characters")
    private String lastName;

    @NotBlank(message = "Department must not be blank")
    @Size(min = 2, max = 50, message = "Length of department must be between {min} to {max} characters")
    private String department;

    @NotBlank(message = "Title must not be blank")
    @Size(min = 2, max = 50, message = "Length of title must be between {min} to {max} characters")
    private String title;

    private String supervisor;

    private Set<String> subordinates;

    @NotEmpty(message = "User role must be specified")
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
