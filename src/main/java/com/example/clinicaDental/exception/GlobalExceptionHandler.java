package com.example.clinicaDental.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.apache.log4j.*;


@ControllerAdvice
public class GlobalExceptionHandler {

    Logger logger = Logger.getLogger(String.valueOf(GlobalExceptionHandler.class));

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> allError (Exception e, WebRequest req){

        logger.error(e.getMessage());
        return new ResponseEntity("Error: "+ e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
