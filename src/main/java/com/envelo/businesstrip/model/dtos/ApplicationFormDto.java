package com.envelo.businesstrip.model.dtos;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ApplicationFormDto {
    private Long id;

    @NotNull(message = "Creation Date must not be null")
    private LocalDateTime creationDate;

    private LocalDateTime lastModificationDate;
    private Integer groupNumber;

    @NotNull(message = "Commissioner must not be null")
    private UserDto commissioner;

    private String delegationPurpose;
    private String comment;
    private LocalDate declaredStartDate;
    private LocalDate declaredEndDate;
    private List<DestinationDto> destinations;
    private AdvancePaymentDto advancePayment;
    private Set<TransportDto> transports;
}
