package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.enums.Department;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@NoArgsConstructor
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User author;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Department department;

    @Column(nullable = false)
    private LocalDateTime creationTime;

    @Column(nullable = false)
    private String content;

    public Comment(User author, Department department, LocalDateTime creationTime, String content) {
        this.author = author;
        this.department = department;
        this.creationTime = creationTime;
        this.content = content;
    }

}
