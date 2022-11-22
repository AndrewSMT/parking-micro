package com.andrew.client.service;

import com.andrew.client.dto.ClientDto;

import java.util.List;

public interface ClientService {

    ClientDto getClient(Long id);

    List<ClientDto> getClients();

}
