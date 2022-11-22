package com.andrew.client.controller;

import com.andrew.client.dto.ClientDto;
import com.andrew.client.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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



}
