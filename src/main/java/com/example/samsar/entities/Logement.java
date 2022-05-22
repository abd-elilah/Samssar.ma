package com.example.samsar.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Logement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    @ManyToOne
    private TypeLog typeLog;
    private double superficie;
    @ManyToOne
    private StatusLog status;
    private double prix;
    private String description;
    private String adress;
    private int nbrDeColoc;
    private int nbrDeChambre;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Ville ville;
    @OneToMany(mappedBy = "logement")
    List<Image> images;

}
