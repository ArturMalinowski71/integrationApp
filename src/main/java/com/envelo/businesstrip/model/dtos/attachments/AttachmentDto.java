package com.envelo.businesstrip.model.dtos.attachments;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public abstract class AttachmentDto extends AttachmentLightweightDto {

    @NotNull(message = "Scan of document must not be null.")
    private byte[] scanOfDocument;

    public AttachmentDto(String type, BigDecimal amount, byte[] scanOfDocument) {
        super(type, amount);
        this.scanOfDocument = scanOfDocument;
    }
}
