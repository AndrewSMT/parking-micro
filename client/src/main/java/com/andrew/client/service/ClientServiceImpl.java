package com.andrew.client.service;

import com.andrew.client.dto.ClientDto;
import com.andrew.client.mapper.ClientMapper;
import com.andrew.client.model.Client;
import com.andrew.client.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    private final ClientMapper clientMapper;

    @Override
    public ClientDto getClient(Long id) {
       return clientMapper.clientToClientDto(clientRepository.findById(id).orElseThrow());
    }

    @Override
    public List<ClientDto> getClients() {
        return clientMapper.clientsToClientDtos((List<Client>) clientRepository.findAll());
    }

    @Override
    public ClientDto createClient(ClientDto clientDto) {
        return null;
    }

    @Override
    public ClientDto updateClient(ClientDto clientDto) {
        return null;
    }

    @Override
    public void deleteClient(Long id) {

    }
}
