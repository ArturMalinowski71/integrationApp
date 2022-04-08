package com.envelo.businesstrip.model.dtos;

import lombok.*;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class OwnTransportDto {

    private Long id;

    @NotNull(message = "Own transport type must not be null")
    private OwnTransportTypeDto ownTransportTypeDto;

    private int kilometersTravelled;
}
