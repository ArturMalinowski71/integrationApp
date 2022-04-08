package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.Comment;
import com.envelo.businesstrip.model.entities.ExpenseReport;
import com.envelo.businesstrip.model.entities.User;
import com.envelo.businesstrip.model.enums.Department;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@Transactional
@Rollback
public class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    void should() {
        User user = new User(
                "przemek",
                "email",
                "Przemek",
                "Przemek",
                "Przemek",
                "Przemek",
                "fsaf",
                new HashSet<>(),
                new HashSet<>());

        List<Comment> comments = List.of(
                new Comment(user, Department.ACCOUNTANT, LocalDateTime.now(), "fajne"),
                new Comment(user, Department.ACCOUNTANT, LocalDateTime.now(), "fajne1"),
                new Comment(user, Department.ACCOUNTANT, LocalDateTime.now(), "fajne2")
        );

        ExpenseReport expenseReport = new ExpenseReport(
                LocalDateTime.now(),
                LocalDateTime.now(),
                user,
                user,
                LocalDateTime.now(),
                LocalDateTime.now(),
                "fsfa",
                new ArrayList<>(),
                new ArrayList<>(),
                comments);

        Object o = entityManager.persistAndGetId(expenseReport);

//        System.out.println(o.toString());
        List<Comment> allByExpenseReportId =
                commentRepository.findAllByExpenseReportId(Long.parseLong(o.toString()));

        allByExpenseReportId.forEach(System.out::println);
    }
}
