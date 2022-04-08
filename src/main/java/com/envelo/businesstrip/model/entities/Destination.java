package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import com.envelo.businesstrip.model.enums.Hotel;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "destinations")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Destination extends BaseEntity {
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
