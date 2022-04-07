package com.envelo.businesstrip.model.entities.attachments;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "attachments")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
public abstract class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private BigDecimal amount;
    private byte[] scanOfDocument;

    public Attachment(String type, BigDecimal amount, byte[] scanOfDocument) {
        this.type = type;
        this.amount = amount;
        this.scanOfDocument = scanOfDocument;
    }
}
