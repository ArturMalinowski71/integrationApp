package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.Comment;
import com.envelo.businesstrip.model.entities.ExpenseReport;
import com.envelo.businesstrip.model.entities.User;
import com.envelo.businesstrip.model.enums.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
@Transactional
public class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    void findAllByExpenseReportId_shouldReturnListOfComments_whenCommentsAreConnectedToExpenseReport() {
        //given
        User user = User.builder()
                .id("id")
                .email("email")
                .firstName("firstName")
                .lastName("lastName")
                .department("department")
                .title("title")
                .supervisor("supervisor")
                .roles(new HashSet<>())
                .build();


        List<Comment> comments = List.of(
                new Comment(user, Department.ACCOUNTANT, LocalDateTime.now(), "conent1"),
                new Comment(user, Department.ACCOUNTANT, LocalDateTime.now(), "conent2"),
                new Comment(user, Department.ACCOUNTANT, LocalDateTime.now(), "conent3")
        );

        ExpenseReport expenseReportWithComments = ExpenseReport
                .builder()
                .creationTime(LocalDateTime.now())
                .supervisor(user)
                .actualStartDate(LocalDateTime.now())
                .actualEndDate(LocalDateTime.now())
                .bankAccount("bankAccount")
                .comments(comments)
                .build();


        ExpenseReport expenseReportWithoutComments = ExpenseReport
                .builder()
                .creationTime(LocalDateTime.now())
                .supervisor(user)
                .actualStartDate(LocalDateTime.now())
                .actualEndDate(LocalDateTime.now())
                .bankAccount("bankAccount")
                .build();

        Long expenseReportWithCommentsId = (Long)entityManager.persistAndGetId(expenseReportWithComments);
        Long expenseReportWithoutCommentsId = (Long)entityManager.persistAndGetId(expenseReportWithoutComments);

        //when
        List<Comment> allByExpenseReportWithCommentsId = commentRepository.findAllByExpenseReportId(expenseReportWithCommentsId);
        List<Comment> allByExpenseReportWithoutCommentsId = commentRepository.findAllByExpenseReportId(expenseReportWithoutCommentsId);

        //then
        assertThat(allByExpenseReportWithCommentsId).hasSize(3);
        assertThat(allByExpenseReportWithoutCommentsId).hasSize(0);
    }
}
