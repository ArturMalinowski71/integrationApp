package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import com.envelo.businesstrip.model.enums.BusinessTripStatus;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "business_trips")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BusinessTrip extends BaseEntity {
    private String code;

    @ManyToOne(optional = false)
    @JoinColumn(name = "employee_id")
    private User employee;

    private String department;
    private String position;

    @OneToOne(optional = false)
    private ApplicationForm applicationForm;

    @OneToOne
    private ExpenseReport expenseReport;

    @Enumerated
    @Column(nullable = false)
    private BusinessTripStatus businessTripStatus;
}
