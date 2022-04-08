package com.envelo.businesstrip.model.dtos.attachments;

import com.envelo.businesstrip.model.dtos.MealDto;
import com.envelo.businesstrip.model.dtos.PlaceDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class HotelAttachmentLightweightDto extends AttachmentLightweightDto {
    @NotNull(message = "Start date must not be null.")
    private LocalDateTime startDate;

    @NotNull(message = "End date must not be null.")
    private LocalDateTime endDate;

    @NotNull(message = "Place must not be null.")
    private PlaceDto place;

    @NotNull(message = "Country must not be null")
    private String country;

    @NotNull(message = "Meal must not be null.")
    private MealDto meal;
}
