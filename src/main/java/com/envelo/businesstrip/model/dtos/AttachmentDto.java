package com.envelo.businesstrip.model.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class AttachmentDto {
    private Long id;

    @NotBlank(message = "Attachment type must not be blank.")
    @Size(min = 2, max = 50, message = "Length of type must be between 2 to 50 characters.")
    private String type;

    @NotNull(message = "Attachment amount must not be null.")
    private BigDecimal amount;

    @NotNull(message = "Scan of document must not be null.")
    private byte[] scanOfDocument;

    public AttachmentDto(String type, BigDecimal amount, byte[] scanOfDocument) {
        this.type = type;
        this.amount = amount;
        this.scanOfDocument = scanOfDocument;
    }
}
