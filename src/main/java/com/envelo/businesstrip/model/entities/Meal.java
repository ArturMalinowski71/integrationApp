package com.envelo.businesstrip.model.entities;


import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name = "meals")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Meal {
    private int numberOfBreakfasts;
    private int numberOfLunches;
    private int numberOfDinners;
}
