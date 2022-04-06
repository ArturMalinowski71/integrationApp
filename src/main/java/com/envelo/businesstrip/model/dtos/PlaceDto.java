package com.envelo.businesstrip.model.dtos;

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
    private Long id;

    @NotBlank(message = "City must not be blank.")
    @Size(min = 2, max = 50, message = "Length of city must be between 2 to 50 characters.")
    private String city;

    @Size(min = 2, max = 50, message = "Length of street must be between 2 to 50 characters.")
    private String street;

    @Size(min = 2, max = 10, message = "Length of post code must be between 2 to 10 characters.")
    private String postCode;

    @NotNull(message = "CountryDto must not be null.")
    private CountryDto countryDto;

    public PlaceDto(String city, String street, String postCode, CountryDto countryDto) {
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.countryDto = countryDto;
    }
}
