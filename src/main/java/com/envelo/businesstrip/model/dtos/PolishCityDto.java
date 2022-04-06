package com.envelo.businesstrip.model.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class PolishCityDto {

    private Long id;

    @NotBlank
    @Size(min = 2, max = 50, message = "Length of name must be between 2 and 50 characters.")
    private String name;

    public PolishCityDto(String name) {
        this.name = name;
    }
}
