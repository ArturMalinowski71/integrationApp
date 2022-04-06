package com.envelo.businesstrip.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OwnTransport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OwnTransportType ownTransportType;

    private int kilometersTravelled;

    public OwnTransport(OwnTransportType ownTransportType, int kilometersTravelled) {
        this.ownTransportType = ownTransportType;
        this.kilometersTravelled = kilometersTravelled;
    }
}
