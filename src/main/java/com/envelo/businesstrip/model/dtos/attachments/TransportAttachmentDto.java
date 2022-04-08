package com.envelo.businesstrip.model.dtos.attachments;

import com.envelo.businesstrip.model.dtos.TransportDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class TransportAttachmentDto extends AttachmentDto {
    @NotNull(message = "Start date must not be null.")
    private LocalDateTime startDate;

    @NotNull(message = "End date must not be null.")
    private LocalDateTime endDate;

    @NotNull(message = "Starting place must not be null.")
    private String startingPlace;

    @NotNull(message = "Destination place must not be null.")
    private String destinationPlace;

    @NotNull(message = "Transport must not be null")
    private TransportDto transportDto;
}
