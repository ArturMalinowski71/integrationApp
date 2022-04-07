package com.envelo.businesstrip.model.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@Table(name = "meals")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numberOfBreakfasts;
    private int numberOfLunches;
    private int numberOfDinners;
}
