package com.envelo.businesstrip.model.dtos;

import com.envelo.businesstrip.model.enums.LogLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class SystemLogDto {
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private LogLevel logLevel;

    @NotBlank
    @Size(min = 2, max = 50, message = "Length of invoker user name must be between {min} to {max} characters.")
    private String invokerUserName;

    @NotBlank
    @Size(min = 2, max = 200, message = "Length of log details must be between {min} to {max} characters.")
    private String logDetails;

    @NotNull
    private LocalDateTime logDate;

    public SystemLogDto(LogLevel logLevel, String invokerUserName, String logDetails, LocalDateTime logDate) {
        this.logLevel = logLevel;
        this.invokerUserName = invokerUserName;
        this.logDetails = logDetails;
        this.logDate = logDate;
    }
}
