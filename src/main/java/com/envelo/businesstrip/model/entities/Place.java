package com.envelo.businesstrip.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Embeddable
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

    @NotNull
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY, optional = false)
    private Country country;
}