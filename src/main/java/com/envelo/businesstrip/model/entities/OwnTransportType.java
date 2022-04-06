package com.envelo.businesstrip.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OwnTransportType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal pricePerKilometer;

    public OwnTransportType(String name, BigDecimal pricePerKilometer) {
        this.name = name;
        this.pricePerKilometer = pricePerKilometer;
    }
}
