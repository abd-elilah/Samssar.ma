package com.example.samsar;

import com.example.samsar.entities.Client;
import com.example.samsar.entities.Logement;
import com.example.samsar.entities.Ville;
import com.example.samsar.enums.StatusLogement;
import com.example.samsar.enums.typeLogement;
import com.example.samsar.repositories.ClientRepository;
import com.example.samsar.repositories.LogementRepository;
import com.example.samsar.repositories.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SamsarApplication implements CommandLineRunner {

    @Autowired
    ClientRepository clientRepository;
    @Autowired
    VilleRepository villeRepository;
    @Autowired
    LogementRepository logementRepository;

    public static void main(String[] args)  {

        SpringApplication.run(SamsarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {



        for (int i = 0 ; i<30 ; i++){

            clientRepository.save(new Client(null , "hamza"+i,"nassour"+i,"hamza.nassour"+i+"@gmail.com" , "0645362"+i,"Hnas2018","hamza"+i+".png",null,null));


        }


        for (int i =0 ; i<100 ; i++){

            long id_client=(long)((Math.random()*29));
            long id_ville=(long)((Math.random()*49));
            logementRepository.save(new Logement(null , " l'immobilier de lux " , typeLogement.Villa , 110.3+i, StatusLogement.disponible , 500+i ,"2 chambre + 2 toilette+cuisine","sidi abbad",4,5,clientRepository.findClientById(id_client),villeRepository.findVilleById(id_ville),null ));

        }

    }
}
