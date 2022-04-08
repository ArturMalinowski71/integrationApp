package com.envelo.businesstrip.model.dtos;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PlaceDto {
    private Long id;

    @NotBlank(message = "City must not be blank.")
    @Size(min = 2, max = 50, message = "Length of city must be between {min} to {max} characters.")
    private String city;

    @Size(min = 2, max = 50, message = "Length of street must be between {min} to {max} characters.")
    private String street;

    @Size(min = 2, max = 10, message = "Length of post code must be between {min} to {max} characters.")
    private String postCode;
}
