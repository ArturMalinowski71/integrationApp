package com.envelo.businesstrip.model.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Getter
@Setter
public class OwnTransportDto {

    private Long id;

    @NotNull(message = "Own transport type must not be null")
    private OwnTransportTypeDto ownTransportTypeDto;

    private int kilometersTravelled;

    public OwnTransportDto(OwnTransportTypeDto ownTransportTypeDto, int kilometersTravelled) {
        this.ownTransportTypeDto = ownTransportTypeDto;
        this.kilometersTravelled = kilometersTravelled;
    }
}
