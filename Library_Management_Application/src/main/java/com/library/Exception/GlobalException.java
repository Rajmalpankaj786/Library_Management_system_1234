package com.library.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(NotFoundException.class)
	public ResponseEntity<MyError> notFoundException(NotFoundException nfe ,WebRequest request) {
		MyError  error = new MyError(LocalDateTime.now(),nfe.getMessage(),request.getDescription(false));
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
}
