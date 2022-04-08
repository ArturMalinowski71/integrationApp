package com.envelo.businesstrip.model.dtos.businessTrips;

import com.envelo.businesstrip.model.dtos.DestinationDto;
import com.envelo.businesstrip.model.dtos.UserDto;
import com.envelo.businesstrip.model.enums.BusinessTripStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BusinessTripSnippetDto {
    private Long id;

    //from BusinessTrip
    private String code;
    private String department;
    private String position;
    private BusinessTripStatus businessTripStatus;

    //from ApplicationForm
    private String delegationPurpose;
    private String comment;
    private LocalDate declaredStartDate;
    private LocalDate declaredEndDate;
    private List<DestinationDto> destinations;
    private UserDto commissioner;

    //from ExpenseReport
    private LocalDateTime actualStartDate;
    private LocalDateTime actualEndDate;
    private String bankAccount;
}
