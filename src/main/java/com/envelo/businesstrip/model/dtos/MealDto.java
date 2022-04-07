package com.envelo.businesstrip.model.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MealDto {

    private Long id;
    private int numberOfBreakfasts;
    private int numberOfLunches;
    private int numberOfDinners;

    public MealDto(int numberOfBreakfasts, int numberOfLunches, int numberOfDinners) {
        this.numberOfBreakfasts = numberOfBreakfasts;
        this.numberOfLunches = numberOfLunches;
        this.numberOfDinners = numberOfDinners;
    }
}
