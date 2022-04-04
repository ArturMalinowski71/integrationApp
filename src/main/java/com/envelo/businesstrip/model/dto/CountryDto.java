package com.envelo.businesstrip.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class CountryDto {
    private long id;

    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @NotNull
    private BigDecimal dietAmount;

    @NotBlank
    @Size(min = 2, max = 50)
    private String dietCurrency;

    private boolean isActive;

    @NotNull
    private String documentVersion;
}
