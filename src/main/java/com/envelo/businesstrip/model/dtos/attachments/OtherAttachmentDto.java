package com.envelo.businesstrip.model.dtos.attachments;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class OtherAttachmentDto extends AttachmentDto {
    @NotNull(message = "Date must not be null")
    private LocalDate date;

    @NotBlank(message = "Description must not be blank")
    private String description;

    public OtherAttachmentDto(String type,
                              BigDecimal amount,
                              byte[] scanOfDocument,
                              LocalDate date,
                              String description) {
        super(type, amount, scanOfDocument);
        this.date = date;
        this.description = description;
    }
}
