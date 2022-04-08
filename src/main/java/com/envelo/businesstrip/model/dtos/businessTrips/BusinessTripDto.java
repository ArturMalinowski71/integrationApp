package com.envelo.businesstrip.model.dtos.businessTrips;

import com.envelo.businesstrip.model.dtos.expenseReport.ExpenseReportDto;
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
public class BusinessTripDto extends BusinessTripBaseDto {
    private ExpenseReportDto expenseReportDto;
}
