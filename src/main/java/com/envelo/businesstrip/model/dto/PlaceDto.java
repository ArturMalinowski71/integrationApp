package com.envelo.businesstrip.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class PlaceDto {
    private long id;

    @NotBlank
    @Size(min = 2, max = 50)
    private String city;

    @NotBlank
    @Size(min = 2, max = 50)
    private String street;

    @NotBlank
    @Size(min = 2, max = 50)
    private String postCode;

    @NotNull
    private CountryDto countryDto;
}
