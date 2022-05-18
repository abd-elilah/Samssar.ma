package com.example.samsar.web;

import com.example.samsar.entities.Logement;
import com.example.samsar.entities.Ville;
import com.example.samsar.enums.typeLogement;
import com.example.samsar.repositories.LogementRepository;
import com.example.samsar.repositories.VilleRepository;
import org.hibernate.mapping.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;

@Controller
public class LogementController {

    @Autowired
    LogementRepository logementRepository;
    @Autowired
    VilleRepository villeRepository;
    @GetMapping(value = "/logement/rechercher")
    public String  rechercher(Model model , @RequestParam String ville){

        List<Logement> logementList = logementRepository.findLogementByVille_Name(ville);
        model.addAttribute("logements" , logementList);
        return "logements";
    }
    @GetMapping(path = "/logement/ajouter")
    public String ajouterLogement(Model model ){

        List<Ville> villes =villeRepository.findAll();
        model.addAttribute("villes" , villes);
      return "ajouterLogement";
    }




}
