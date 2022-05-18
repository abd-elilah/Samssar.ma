package com.example.samsar.repositories;

import com.example.samsar.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ClientRepository extends JpaRepository<Client, Long> {

    public Client findClientById(Long id);
}
