package com.envelo.businesstrip.model.entities;

import com.envelo.businesstrip.model.enums.LogLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "system_logs")
@NoArgsConstructor
@Getter
@Setter
public class SystemLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private LogLevel logLevel;
    private String invokerUserName;
    private String logDetails;
    private LocalDateTime logDate;

    public SystemLog(LogLevel logLevel, String invokerUserName, String logDetails, LocalDateTime logDate) {
        this.logLevel = logLevel;
        this.invokerUserName = invokerUserName;
        this.logDetails = logDetails;
        this.logDate = logDate;
    }
}
