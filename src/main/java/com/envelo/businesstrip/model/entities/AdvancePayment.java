package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "advance_payments")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AdvancePayment extends BaseEntity {
    @Column(nullable = false)
    private BigDecimal amount;
}
