package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.entities.base.BaseEntity;
import com.envelo.businesstrip.model.enums.LogLevel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "system_logs")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class SystemLog extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private LogLevel logLevel;

    private String invokerUserName;
    private String logDetails;
    private LocalDateTime logDate;
}
