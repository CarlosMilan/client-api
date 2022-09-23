package com.mm.api.clients.service;

import com.mm.api.clients.domain.Client;
import com.mm.api.clients.exceptions.ClientNotFoundException;
import com.mm.api.clients.repository.ClientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRespository clientRespository;


    public List<Client> getAllClients() {
        List<Client> clients = clientRespository.findAll();
        return clients;
    }

    public Client findById(Long id) {
        return clientRespository.findById(id).orElseThrow(() -> new ClientNotFoundException("Client not found"));
    }

    public Client findByEmail(String email) {
        return clientRespository.findByEmail(email).orElseThrow(() -> new ClientNotFoundException("Client not found with email: " + email));
    }

    public Client save(Client client) {
        Client savedClient = clientRespository.save(client);
        return savedClient;
    }

}
