package com.envelo.businesstrip.model.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class AdvancePaymentDto {

    private Long id;

    @NotNull(message = "Advance payment amount must not be null.")
    private BigDecimal amount;

    public AdvancePaymentDto(BigDecimal amount) {
        this.amount = amount;
    }
}
