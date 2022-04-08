package com.envelo.businesstrip.model.dtos.attachments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class OtherAttachmentDto extends AttachmentDto {
    @NotNull(message = "Date must not be null")
    private LocalDate date;

    @NotBlank(message = "Description must not be blank")
    private String description;
}
