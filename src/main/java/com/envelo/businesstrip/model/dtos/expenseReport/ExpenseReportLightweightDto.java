package com.envelo.businesstrip.model.dtos.expenseReport;

import com.envelo.businesstrip.model.dtos.attachments.AttachmentLightweightDto;
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
public class ExpenseReportLightweightDto extends ExpenseReportBaseDto{
    private List<AttachmentLightweightDto> attachmentsLightweightDto;
}
