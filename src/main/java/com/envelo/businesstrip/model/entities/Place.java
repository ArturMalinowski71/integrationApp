package com.envelo.businesstrip.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Place {
    @Column(nullable = false, length = 50)
    private String city;

    @Column(length = 50)
    private String street;

    @Column(length = 10)
    private String postCode;
}