package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.enums.Department;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String authorId;

    @Enumerated(EnumType.STRING)
    private Department department;

    private LocalDateTime creationTime;
    private String content;

    public Comment(String authorId, Department department, LocalDateTime creationTime, String content) {
        this.authorId = authorId;
        this.department = department;
        this.creationTime = creationTime;
        this.content = content;
    }

}
