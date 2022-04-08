package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "own_transports")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class OwnTransport extends BaseEntity {
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OwnTransportType ownTransportType;

    private int kilometersTravelled;
}
