package com.andrew.client.mapper;

import com.andrew.client.dto.ClientDto;
import com.andrew.client.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    Client clientDtoToClient(ClientDto clientDto);

    ClientDto clientToClientDto(Client client);

    List<Client> clientDtosToClients(List<ClientDto> clientDto);

    List<ClientDto> clientsToClientDtos(List<Client> client);
}
