package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.enums.Hotel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "destinations")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Destination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate checkInDate;

    @Column(nullable = false)
    private LocalDate checkOutDate;

    @Embedded
    private Meal meal;

    @Embedded
    private Place place;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Country country;
}
