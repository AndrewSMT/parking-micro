package com.andrew.client.service;

import com.andrew.client.dto.ClientDto;
import com.andrew.client.mapper.ClientMapper;
import com.andrew.client.model.Client;
import com.andrew.client.repository.ClientRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    ClientMapper clientMapper = Mappers.getMapper(ClientMapper.class);

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientDto getClient(Long id) {
       return clientMapper.INSTANCE.clientToClientDto(clientRepository.findById(id).orElseThrow());
    }

    @Override
    public List<ClientDto> getClients() {
        return clientMapper.INSTANCE.clientsToClientDtos((List<Client>) clientRepository.findAll());
    }

}
