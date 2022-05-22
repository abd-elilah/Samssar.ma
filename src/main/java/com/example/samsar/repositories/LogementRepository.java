package com.example.samsar.repositories;

import com.example.samsar.entities.Logement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface LogementRepository extends JpaRepository<Logement, Long> {


    Page<Logement> findLogementsByVilleNameAndTypeLogName(String villeName ,String type ,  Pageable pageable);


}
