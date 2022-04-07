package com.envelo.businesstrip.model.entities.attachments;

import com.envelo.businesstrip.model.entities.Meal;
import com.envelo.businesstrip.model.entities.Place;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "hotel_attachments")
@Getter
@Setter
@NoArgsConstructor
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

    public HotelAttachment(String type, BigDecimal amount, byte[] scanOfDocument, LocalDate startDate,
                           LocalDate endDate, Place place, String country, Meal meal) {
        super(type, amount, scanOfDocument);
        this.startDate = startDate;
        this.endDate = endDate;
        this.place = place;
        this.country = country;
        this.meal = meal;
    }
}
