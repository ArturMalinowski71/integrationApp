package com.envelo.businesstrip.model.dtos;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class TransportDto {
    private Long id;

    @NotBlank(message = "Type must not be null.")
    @Size(min = 2, max = 50, message = "Length of type must be between {min} to {max} characters.")
    private String type;
}
