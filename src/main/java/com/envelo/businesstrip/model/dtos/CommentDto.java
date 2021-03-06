package com.envelo.businesstrip.model.dtos;

import com.envelo.businesstrip.model.enums.Department;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CommentDto {

    private Long id;

    @NotBlank(message = "Author ID must not be blank.")
    @Size(min = 2, max = 50, message = "Length of author ID must be between {min} to {max} characters.")
    private String authorId;

    @NotNull(message = "Department must not be null.")
    @Enumerated(EnumType.STRING)
    private Department department;

    @NotNull(message = "Creation time must not be null.")
    private LocalDateTime creationTime;

    @NotBlank(message = "Comment content must not be blank.")
    @Size(min = 2, max = 200, message = "Length of comment's content must be between {min} to {max} characters.")
    private String content;
}
