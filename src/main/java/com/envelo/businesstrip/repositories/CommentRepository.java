package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query(value = "select * from comments c, expense_reports er where er.id=?1 and c.expense_report_id=er.id", nativeQuery = true)
    List<Comment> findAllByExpenseReportId(Long expenseReportId);
}
