package com.mm.api.clients.repository;

import com.mm.api.clients.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRespository extends JpaRepository<Client, Long> {
    Optional<Client> findByEmail(String email);
}



