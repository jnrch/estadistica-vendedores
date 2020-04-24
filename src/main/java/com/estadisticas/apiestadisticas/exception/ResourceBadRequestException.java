package com.estadisticas.apiestadisticas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ResourceBadRequestException extends Exception{

    /**
     * Instantiates a new Resource BAD REQUEST exception.
     *
     * @param message the message
     */

    public ResourceBadRequestException(String message) {
        super(message);
    }
}
