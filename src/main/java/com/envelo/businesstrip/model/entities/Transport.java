package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "transports")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Transport extends BaseEntity {
    private String type;
}
