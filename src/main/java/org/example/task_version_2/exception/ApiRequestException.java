package org.example.task_version_2.exception;

import org.springframework.http.HttpStatus;

public class ApiRequestException extends RuntimeException{
    private final HttpStatus status;
    public ApiRequestException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getHttpStatus() {
        return status;
    }
}
