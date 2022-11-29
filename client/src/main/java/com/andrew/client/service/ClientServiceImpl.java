package com.andrew.client.service;

import com.andrew.client.dto.ClientDto;
import com.andrew.client.mapper.ClientMapper;
import com.andrew.client.model.Client;
import com.andrew.client.repository.ClientRepository;
import com.andrew.client.service.exception.ObjectNotFoundException;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    ClientMapper clientMapper = Mappers.getMapper(ClientMapper.class);

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public ClientDto getClient(Long id) {
       return clientMapper.INSTANCE.clientToClientDto(clientRepository.findById(id)
               .orElseThrow(() -> new ObjectNotFoundException(id, ClientDto.class)));
    }

    @Override
    public List<ClientDto> getClients() {
        return clientMapper.INSTANCE.clientsToClientDtos((List<Client>) clientRepository.findAll());
    }

    @Override
    public ClientDto createClient(ClientDto clientDto) {
        Client client = clientMapper.INSTANCE.clientDtoToClient(clientDto);
        return clientMapper.INSTANCE.clientToClientDto(clientRepository.save(client));
    }

    @Override
    public ClientDto updateClient(Long id, ClientDto clientDto) {
        Client clientFromDb = clientRepository.findById(id).get();
        clientDto.setClientId(clientFromDb.getClientId());

        Client client = clientMapper.INSTANCE.clientDtoToClient(clientDto);
        return clientMapper.INSTANCE.clientToClientDto(clientRepository.save(client));
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

}
