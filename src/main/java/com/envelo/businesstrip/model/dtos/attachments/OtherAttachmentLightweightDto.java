package com.envelo.businesstrip.model.dtos.attachments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class OtherAttachmentLightweightDto extends AttachmentLightweightDto {
    @NotNull(message = "Date must not be null")
    private LocalDate date;

    @NotBlank(message = "Description must not be blank")
    private String description;

    public OtherAttachmentLightweightDto(String type,
                                         BigDecimal amount,
                                         LocalDate date,
                                         String description) {
        super(type, amount);
        this.date = date;
        this.description = description;
    }
}
