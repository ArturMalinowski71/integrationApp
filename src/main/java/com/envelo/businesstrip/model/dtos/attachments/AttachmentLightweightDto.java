package com.envelo.businesstrip.model.dtos.attachments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public abstract class AttachmentLightweightDto {
    private Long id;

    @NotBlank(message = "Attachment type must not be blank.")
    @Size(min = 2, max = 50, message = "Length of type must be between {min} to {max} characters.")
    private String type;

    @DecimalMin(value = "0.00", message = "Attachment amount can not be less then 0.00")
    @NotNull(message = "Attachment amount must not be null.")
    private BigDecimal amount;

    public AttachmentLightweightDto(String type, BigDecimal amount) {
        this.type = type;
        this.amount = amount;
    }
}
