package com.envelo.businesstrip.model.dtos;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PolishCityDto {

    private Long id;

    @NotBlank
    @Size(min = 2, max = 50, message = "Length of name must be between {min} to {max} characters.")
    private String name;
}
