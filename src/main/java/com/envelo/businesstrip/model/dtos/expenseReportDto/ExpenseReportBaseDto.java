package com.envelo.businesstrip.model.dtos.expenseReportDto;

import com.envelo.businesstrip.model.dtos.CommentDto;
import com.envelo.businesstrip.model.dtos.OwnTransportDto;
import com.envelo.businesstrip.model.dtos.UserDto;
import com.envelo.businesstrip.model.dtos.attachments.AttachmentLightweightDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class ExpenseReportBaseDto {
    private Long id;

    @NotNull(message = "Creation time must not be null")
    private LocalDateTime creationTime;

    private LocalDateTime acceptanceTime;
    private UserDto supervisorDto;
    private UserDto accountantDto;
    private LocalDateTime actualStartDate;
    private LocalDateTime actualEndDate;
    private String bankAccount;
    private List<OwnTransportDto> ownTransportsDto;
    private List<CommentDto> commentsDto;
}
