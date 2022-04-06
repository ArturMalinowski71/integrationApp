package com.envelo.businesstrip.model.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class TransportDto {
    private Long id;

    @NotBlank(message = "Type must not be null.")
    @Size(min = 2, max = 50, message = "Length of type must be between 2 to 50 characters.")
    private String type;

    public TransportDto(String type) {
        this.type = type;
    }
}
