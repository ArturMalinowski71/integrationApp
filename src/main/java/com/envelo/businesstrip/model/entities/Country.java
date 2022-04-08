package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "countries")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Country extends BaseEntity {
    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private BigDecimal dietAmount;

    private boolean isActive = true;

    @Column(nullable = false, length = 50)
    private String documentVersion;
}
