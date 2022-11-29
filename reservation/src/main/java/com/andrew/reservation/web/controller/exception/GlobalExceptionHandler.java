package com.andrew.reservation.web.controller.exception;

import com.andrew.reservation.dto.error.ErrorDto;
import com.andrew.reservation.dto.error.ErrorResultDto;
import com.andrew.reservation.service.exception.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<Object> handleObjectNotFoundException(ObjectNotFoundException ex) {
        String errorMessage = ex.isMessagePresent()
                ? ex.getMessage()
                : String.format("Object not found [id=%s, objectType=%s]", ex.getId(), ex.getObjectClass());

        log.warn(errorMessage, ex);

        ErrorDto errorDto = new ErrorDto("OBJECT_NOT_FOUND", errorMessage);

        ErrorResultDto errorResultDto = new ErrorResultDto(List.of(errorDto));

        return ResponseEntity.badRequest().body(errorResultDto);
    }
}
