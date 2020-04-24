package com.estadisticas.apiestadisticas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

    /**
     * Start a new Resource not found exception
     * @param message the message
     */

    public ResourceNotFoundException(String message) {super(message);}
}
