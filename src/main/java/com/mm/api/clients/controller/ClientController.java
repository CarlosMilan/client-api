package com.mm.api.clients.controller;

import com.mm.api.clients.domain.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {


    //GET: obtener informacion
    //POST: guardar informacion
    //PUT: editar informacion
    //DELETE: borrar informacion

    // Verbos web, codigos http

    @GetMapping(value = "/get")
    public ResponseEntity<Client> getClient() {

        Client client = new Client();
        client.setName("John");
        client.setLastName("Conor");
        client.setEmail("j.conor@email.com");

        return new ResponseEntity<>(client, HttpStatus.OK);
    }

}
