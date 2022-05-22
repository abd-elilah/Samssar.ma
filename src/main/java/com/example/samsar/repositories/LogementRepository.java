package com.example.samsar.repositories;

import com.example.samsar.entities.Logement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LogementRepository extends JpaRepository<Logement, Long> {


    List<Logement> findByVille_Name(String villeName);


}
