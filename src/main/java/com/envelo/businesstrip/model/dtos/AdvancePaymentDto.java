package com.envelo.businesstrip.model.dtos;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class AdvancePaymentDto {

    private Long id;

    @NotNull(message = "Advance payment amount must not be null.")
    private BigDecimal amount;
}
