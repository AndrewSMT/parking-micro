package com.andrew.client.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ClientDto {

    private Long clientId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

}
