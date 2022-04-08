package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Place {
    @Column(nullable = false, length = 50)
    private String city;

    @Column(length = 50)
    private String street;

    @Column(length = 10)
    private String postCode;
}