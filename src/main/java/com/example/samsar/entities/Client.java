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
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom;
    private String prenom;
    private String email;
    private String phone;
    private String password;
    private String img;
    @OneToMany(mappedBy = "client")
    List<Logement> logementList ;
    @OneToMany(mappedBy = "client")
    List<Demande> demandes ;
}
