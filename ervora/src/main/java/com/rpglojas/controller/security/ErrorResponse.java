package com.rpglojas.controller.security;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Value
@AllArgsConstructor
public class ErrorResponse {

    private final HttpStatus status;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private String message;
    private String debugMessage;

    public ErrorResponse(HttpStatus status, Throwable ex) {
        this(status, LocalDateTime.now(), "Unexpected error", ex.getLocalizedMessage());
    }

    public ErrorResponse(HttpStatus status, String message, Throwable ex) {
        this(status, LocalDateTime.now(), message, ex.getLocalizedMessage());
    }

    public ErrorResponse(HttpStatus status, String message) {
        this(status, LocalDateTime.now(), message, null);
    }
}
