package com.example.samsar.web;

import com.example.samsar.entities.Logement;
import com.example.samsar.entities.TypeLog;
import com.example.samsar.entities.Ville;
import com.example.samsar.repositories.LogementRepository;
import com.example.samsar.repositories.TypeLogRepositrory;
import com.example.samsar.repositories.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LogementController {

    @Autowired
    LogementRepository logementRepository;
    @Autowired
    VilleRepository villeRepository;
    @Autowired
    TypeLogRepositrory typeLogRepositrory;

    @GetMapping(value = "/logement/rechercher")
    public String rechercher(Model model, @RequestParam(name = "page", defaultValue ="0" ) int page) {
        Page<Logement> list = logementRepository.findAll(PageRequest.of(page , 6));
        model.addAttribute("listeDesLogements", list.getContent());
        model.addAttribute("pages" ,new int[list.getTotalPages()] );
        model.addAttribute("pagecourant" , page);
        return "logements";
    }

    @GetMapping(path = "/logement/ajouter")
    public String ajouterLogement(Model model) {

        List<Ville> villes = villeRepository.findAll();
        List<TypeLog> types = typeLogRepositrory.findAll();
        model.addAttribute("villes", villes);
        model.addAttribute("types", types);
        return "add_announce";
    }


}
