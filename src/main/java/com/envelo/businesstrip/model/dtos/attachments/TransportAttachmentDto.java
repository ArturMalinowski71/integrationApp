package com.envelo.businesstrip.model.dtos.attachments;

import com.envelo.businesstrip.model.dtos.PlaceDto;
import com.envelo.businesstrip.model.dtos.TransportDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
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

    public TransportAttachmentDto(String type,
                                  BigDecimal amount,
                                  byte[] scanOfDocument,
                                  LocalDateTime startDate,
                                  LocalDateTime endDate,
                                  String startingPlace,
                                  String destinationPlace,
                                  TransportDto transportDto) {
        super(type, amount, scanOfDocument);
        this.startDate = startDate;
        this.endDate = endDate;
        this.startingPlace = startingPlace;
        this.destinationPlace = destinationPlace;
        this.transportDto = transportDto;
    }
}
