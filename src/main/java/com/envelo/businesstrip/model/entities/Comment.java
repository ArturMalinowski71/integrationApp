package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import com.envelo.businesstrip.model.enums.Department;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Comment extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User author;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Department department;

    @Column(nullable = false)
    private LocalDateTime creationTime;

    @Column(nullable = false)
    private String content;
}
