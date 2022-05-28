package com.example.samsar;

import com.example.samsar.entities.Logement;
import com.example.samsar.entities.StatusLog;
import com.example.samsar.entities.TypeLog;
import com.example.samsar.repositories.ClientRepository;
import com.example.samsar.repositories.LogementRepository;
import com.example.samsar.repositories.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.ManyToOne;

@SpringBootApplication
public class SamsarApplication implements CommandLineRunner {



    public static void main(String[] args) {

        SpringApplication.run(SamsarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {






    }
}
