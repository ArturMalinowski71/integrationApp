package com.envelo.businesstrip.model.entities.attachments;

import com.envelo.businesstrip.model.entities.Meal;
import com.envelo.businesstrip.model.entities.Place;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "hotel_attachments")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class HotelAttachment extends Attachment {
    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @Embedded
    private Place place;

    @Column(nullable = false, length = 50)
    private String country;

    @Embedded
    private Meal meal;
}
