package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.ExpenseReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseReportRepository extends JpaRepository<ExpenseReport,Long> {
}
