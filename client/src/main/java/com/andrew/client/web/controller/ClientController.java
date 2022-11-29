package com.andrew.client.web.controller;

import com.andrew.client.dto.ClientDto;
import com.andrew.client.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(value = "/{id}")
    public ClientDto getClient(@PathVariable Long id) {
        return clientService.getClient(id);
    }

    @GetMapping
    public List<ClientDto> getClients() {
        return clientService.getClients();
    }

    @PostMapping
    public ClientDto createClient(@RequestBody ClientDto clientDto) {
        return clientService.createClient(clientDto);
    }

    @PutMapping(value = "/{id}")
    public ClientDto updateClient(@PathVariable Long id, @RequestBody ClientDto clientDto) {
        return clientService.updateClient(id, clientDto);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }

}
