package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query(value = "SELECT * FROM comments c, expense_reports er WHERE er.id=?1 AND c.expense_report_id=er.id", nativeQuery = true)
    List<Comment> findAllByExpenseReportId(Long expenseReportId);
}
