package com.envelo.businesstrip.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "advance_payments")
@NoArgsConstructor
@Getter
@Setter
public class AdvancePayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal amount;

    public AdvancePayment(BigDecimal amount) {
        this.amount = amount;
    }
}
