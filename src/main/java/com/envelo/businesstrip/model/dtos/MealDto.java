package com.envelo.businesstrip.model.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MealDto {

    private Long id;
    private int numberOfBreakfasts;
    private int numberOfLunches;
    private int numberOfDinners;
}
