package com.mm.api.clients.controller;

import com.mm.api.clients.domain.Client;
import com.mm.api.clients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    // OBTENER TODOS LOS CLIENTES
    @GetMapping(value = "/all")
    public ResponseEntity<List<Client>> getClients() {
        List<Client> clients = clientService.getAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    // OBTENER UN CLIENTE POR ID
    // GUARDAR NUEVO CLIENTE
    @PostMapping(value = "/")
    public ResponseEntity<Client> save(@RequestBody Client client) {
        Client savedClient = clientService.save(client);
        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
    }


    // EDITAR CLIENTE
    // BORRAR CLIENTE


}
