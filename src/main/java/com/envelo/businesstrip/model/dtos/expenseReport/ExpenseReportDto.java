package com.envelo.businesstrip.model.dtos.expenseReport;

import com.envelo.businesstrip.model.dtos.attachments.AttachmentDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExpenseReportDto extends ExpenseReportBaseDto{
    private List<AttachmentDto> attachmentsDto;
}