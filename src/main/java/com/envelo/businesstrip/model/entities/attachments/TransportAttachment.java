package com.envelo.businesstrip.model.entities.attachments;

import com.envelo.businesstrip.model.entities.Transport;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transport_attachments")
@Getter
@Setter
@NoArgsConstructor
public class TransportAttachment extends Attachment {
    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime endDate;

    @Column(nullable = false, length = 50)
    private String startingPlace;

    @Column(nullable = false, length = 50)
    private String destinationPlace;

    @Column(nullable = false, length = 50)
    private String typeOfTransport;

    public TransportAttachment(String type, BigDecimal amount, byte[] scanOfDocument, LocalDateTime startDate,
                               LocalDateTime endDate, String startingPlace, String destinationPlace, String typeOfTransport) {
        super(type, amount, scanOfDocument);
        this.startDate = startDate;
        this.endDate = endDate;
        this.startingPlace = startingPlace;
        this.destinationPlace = destinationPlace;
        this.typeOfTransport = typeOfTransport;
    }
}
