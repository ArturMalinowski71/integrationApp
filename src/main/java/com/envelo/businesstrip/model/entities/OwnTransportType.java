package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "own_transport_types")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class OwnTransportType extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal pricePerKilometer;
}
