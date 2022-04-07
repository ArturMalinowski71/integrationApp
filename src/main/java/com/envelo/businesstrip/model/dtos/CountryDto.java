package com.envelo.businesstrip.model.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class CountryDto {
    private Long id;

    @NotBlank(message = "Name must not be null.")
    @Size(min = 2, max = 50, message = "Length of name must be between {min} to {max} characters.")
    private String name;

    @NotNull(message = "Diet amount must not be null") //TODO test with and without @NotNull
    @DecimalMin(value = "0.00", inclusive = false, message = "Diet amount must be higher than 0.00")
    @Digits(integer = 8, fraction = 2, message = "Diet amount fraction must not be higher than 2.")
    private BigDecimal dietAmount;

    @NotBlank(message = "Diet currency must not me blank.")
    @Size(min = 2, max = 50, message = "Diet currency must be in length between {min} to {max} characters.")
    private String dietCurrency;

    private boolean isActive = true;

    @NotBlank(message = "Document version must not be blank")
    @Size(min = 2, max = 50, message = "Document version must be in length between {min} to {max} characters.")
    private String documentVersion;

    public CountryDto(String name, BigDecimal dietAmount, String dietCurrency, boolean isActive, String documentVersion) {
        this.name = name;
        this.dietAmount = dietAmount;
        this.dietCurrency = dietCurrency;
        this.isActive = isActive;
        this.documentVersion = documentVersion;
    }
}
