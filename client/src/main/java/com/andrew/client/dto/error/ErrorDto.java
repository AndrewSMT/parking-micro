package com.andrew.client.dto.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorDto {

    private String code;

    private String errorMessage;
}
