package com.envelo.businesstrip.model.dtos;

import com.envelo.businesstrip.model.enums.Department;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.time.LocalDateTime;
import java.util.Set;

class CommentDtoTest {

    @Test
    void when_authorId_is_blank_then_commentDto_is_not_valid() {

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        CommentDto commentDto = CommentDto
                .builder()
                .authorId("  ")
                .department(Department.ACCOUNTANT)
                .creationTime(LocalDateTime.now())
                .content("Costam")
                .build();

        Set<ConstraintViolation<CommentDto>> violations = validator.validate(commentDto);
        StringBuilder sb = new StringBuilder();
        for(ConstraintViolation<CommentDto> violation : violations) {
            sb.append(violation.getMessage());
        }
        Assertions.assertEquals("Author ID must not be blank.",sb.toString());
    }
}