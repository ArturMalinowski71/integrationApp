package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "application_forms")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ApplicationForm extends BaseEntity {
    @Column(nullable = false)
    private LocalDateTime creationDate;

    private LocalDateTime lastModificationDate;

    private Integer groupNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User commissioner;

    private String delegationPurpose;

    private String comment;

    private LocalDate declaredStartDate;

    private LocalDate declaredEndDate;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "application_form_id")
    private List<Destination> destinations;

    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private AdvancePayment advancePayment;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            joinColumns = @JoinColumn(name = "application_form_id"),
            inverseJoinColumns = @JoinColumn(name = "transport_id"))
    private Set<Transport> transports;
}
