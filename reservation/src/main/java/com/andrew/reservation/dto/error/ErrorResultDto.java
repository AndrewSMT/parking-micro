package com.andrew.reservation.dto.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ErrorResultDto {

    private List<ErrorDto> errors;

}
