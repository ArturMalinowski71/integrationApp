package com.envelo.businesstrip.model.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.math.BigDecimal;

@NoArgsConstructor
@Setter
@Getter
public class OwnTransportTypeDto {
    private Long id;

    @NotBlank(message = "Name must not be null.")
    @Size(min = 2, max = 50, message = "Length of name must be between {min} to {max} characters.")
    private String name;

    @NotNull(message = "Price per kilometer must not be null") //TODO test with and without @NotNull
    @DecimalMin(value = "0.00", inclusive = false, message = "Price per kilometer must be higher than {value}")
    @Digits(integer = 8, fraction = 2, message = "Price per kilometer fraction must not be higher than {fraction}.")
    private BigDecimal pricePerKilometer;

    public OwnTransportTypeDto(String name, BigDecimal pricePerKilometer) {
        this.name = name;
        this.pricePerKilometer = pricePerKilometer;
    }
}
