package com.envelo.businesstrip.model.dtos;

import com.envelo.businesstrip.model.dtos.CountryDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
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

    @Size(min = 2, max = 50)
    private String street;

    @Size(min = 2, max = 50)
    private String postCode;

    @NotNull
    private CountryDto countryDto;
}
