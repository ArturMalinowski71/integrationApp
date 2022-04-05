package com.envelo.businesstrip.model.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class CountryDto {
    private long id;

    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @NotNull //TODO test with and without @NotNull
    @DecimalMin(value = "0.00", inclusive = false)
    @Digits(integer = 8, fraction = 2)
    private BigDecimal dietAmount;

    @NotBlank
    @Size(min = 2, max = 50)
    private String dietCurrency;

    private boolean isActive = true;

    @NotBlank
    @Size(min = 2, max = 50)
    private String documentVersion;
}
