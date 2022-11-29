package com.andrew.client.dto.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class ErrorResultDto {

    private List<ErrorDto> errors;

}
