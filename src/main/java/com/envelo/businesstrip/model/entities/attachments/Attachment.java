package com.envelo.businesstrip.model.entities.attachments;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "attachments")
@Inheritance(strategy = InheritanceType.JOINED)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public abstract class Attachment extends BaseEntity {
    private String type;
    private BigDecimal amount;
    private byte[] scanOfDocument;
}
