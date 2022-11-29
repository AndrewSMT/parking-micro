package com.andrew.parking.dto.error;

import com.andrew.parking.dto.error.ErrorDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ErrorResultDto {

    private List<ErrorDto> errors;

}
