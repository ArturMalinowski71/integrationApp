package com.envelo.businesstrip.exceptions.handling;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@Getter
public class ErrorMessage {

    private String message;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime timeStamp;

    public ErrorMessage(Exception exception) {
        this.timeStamp = LocalDateTime.now();
        this.message = exception.getMessage();
    }
}
