package com.envelo.businesstrip.model.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name = "meals")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Meal {
    private int numberOfBreakfasts;
    private int numberOfLunches;
    private int numberOfDinners;
}
