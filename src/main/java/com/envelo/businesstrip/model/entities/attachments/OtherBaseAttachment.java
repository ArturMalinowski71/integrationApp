package com.envelo.businesstrip.model.entities.attachments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "other_attachments")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class OtherBaseAttachment extends BaseAttachment {
    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private String description;
}
