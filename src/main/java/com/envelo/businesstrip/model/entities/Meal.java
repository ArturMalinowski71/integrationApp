package com.envelo.businesstrip.model.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Embeddable
@NoArgsConstructor
@Getter
@Setter
@Table(name = "meals")
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private int numberOfBreakfasts;

    @Column(nullable=false)
    private int numberOfLunches;

    @Column(nullable=false)
    private int numberOfDinners;
}
