package com.andrew.client.mapper;

import com.andrew.client.dto.ClientDto;
import com.andrew.client.model.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    Client clientDtoToClient(ClientDto clientDto);

    ClientDto clientToClientDto(Client client);

    List<Client> clientDtosToClients(List<ClientDto> clientDto);

    List<ClientDto> clientsToClientDtos(List<Client> client);
}
