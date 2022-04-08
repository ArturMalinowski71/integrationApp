package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "polish_cities")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PolishCity extends BaseEntity {
    @Column(nullable = false, length = 100)
    private String name;
}
