package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.attachments.BaseAttachment;
import com.envelo.businesstrip.model.entities.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "expense_reports")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ExpenseReport extends BaseEntity {
    @Column(nullable = false)
    private LocalDateTime creationTime;

    private LocalDateTime acceptanceTime;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, optional = false)
    private User supervisor;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private User accountant;

    private LocalDateTime actualStartDate;
    private LocalDateTime actualEndDate;
    private String bankAccount;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "expense_report_id")
    private List<BaseAttachment> baseAttachments;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "expense_report_id")
    private List<OwnTransport> ownTransports;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "expense_report_id")
    private List<Comment> comments;
}
