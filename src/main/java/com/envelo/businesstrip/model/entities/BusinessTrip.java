package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.enums.BusinessTripStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "buisness_trips")
@NoArgsConstructor
@Getter
@Setter
public class BusinessTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    @ManyToOne (optional=false)
    @JoinColumn(name = "employee_id")
    private User employee;

    private String department;
    private String position;

    @OneToOne (optional=false)
    private ApplicationForm applicationForm;

    @OneToOne
    private ExpenseReport expenseReport;

    @Enumerated
    @Column(nullable=false)
    private BusinessTripStatus businessTripStatus;

    public BusinessTrip(String code, User employee, String department, String position, ApplicationForm applicationForm, ExpenseReport expenseReport, BusinessTripStatus businessTripStatus) {
        this.code = code;
        this.employee = employee;
        this.department = department;
        this.position = position;
        this.applicationForm = applicationForm;
        this.expenseReport = expenseReport;
        this.businessTripStatus = businessTripStatus;
    }
}
