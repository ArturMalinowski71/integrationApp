package com.envelo.businesstrip.model.dtos;

import com.envelo.businesstrip.model.enums.Hotel;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DestinationDto {
    private Long id;

    @NotNull(message = "Place must not be null.")
    private PlaceDto placeDto;

    @NotNull(message = "Check in date must not be null.")
    private LocalDateTime checkInDate;

    @NotNull(message = "Check out date must not be null.")
    private LocalDateTime checkOutDate;

    @NotNull(message = "Meal must not be null.")
    private MealDto mealDto;

    @NotNull(message = "Hotel must not be null.")
    @Enumerated(EnumType.STRING)
    private Hotel hotel;

    @NotNull(message = "Country must not be null.")
    private CountryDto countryDto;
}
