package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.enums.ExpenseReportStatus;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "expense_reports")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ExpenseReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime creationTime;

    private LocalDateTime acceptanceTime;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User supervisor;

    @ManyToOne(fetch = FetchType.LAZY)
    private User accountant;

    private LocalDateTime actualStartDate;
    private LocalDateTime actualEndDate;
    private String bankAccount;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "expense_report_id")
    private List<Attachment> attachments;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "expense_report_id")
    private List<OwnTransport> ownTransports;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "expense_report_id")
    private List<Comment> comments;
}
