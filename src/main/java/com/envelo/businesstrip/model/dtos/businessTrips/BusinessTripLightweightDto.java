package com.envelo.businesstrip.model.dtos.businessTrips;

import com.envelo.businesstrip.model.dtos.expenseReport.ExpenseReportLightweightDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BusinessTripLightweightDto extends BusinessTripBaseDto {
    private ExpenseReportLightweightDto expenseReportDto;
}
