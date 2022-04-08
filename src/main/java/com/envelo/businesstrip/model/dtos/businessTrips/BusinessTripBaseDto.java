package com.envelo.businesstrip.model.dtos.businessTrips;

import com.envelo.businesstrip.model.entities.ApplicationForm;
import com.envelo.businesstrip.model.enums.BusinessTripStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class BusinessTripBaseDto {
    private Long id;

    private String code;
    @NotBlank(message = "Departament must not be null.")
    @Size(min = 2, max = 50, message = "Length of departament must be between 2 to 50 characters.")
    private String department;

    @NotBlank(message = "Position must not be null.")
    @Size(min = 2, max = 50, message = "Length of position must be between 2 to 50 characters.")
    private String position;

    @NotNull(message = "Application form must not be null.")
    private ApplicationForm applicationForm;


    @NotNull(message = "Status must not be null.")
    private BusinessTripStatus businessTripStatus;
}
