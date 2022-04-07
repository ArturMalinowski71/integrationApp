package com.envelo.businesstrip.model.entities.attachments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "other_attachments")
@Getter
@Setter
@NoArgsConstructor
public class OtherAttachment extends Attachment {
    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private String description;

    public OtherAttachment(String type, BigDecimal amount, byte[] scanOfDocument, LocalDate date, String description) {
        super(type, amount, scanOfDocument);
        this.date = date;
        this.description = description;
    }
}
