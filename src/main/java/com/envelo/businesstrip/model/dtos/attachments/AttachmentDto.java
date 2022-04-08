package com.envelo.businesstrip.model.dtos.attachments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
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
