package com.example.samsar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

    public Client findClientById(Long id);
}
