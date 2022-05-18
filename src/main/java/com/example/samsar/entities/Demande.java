package com.example.samsar.entities;

import com.example.samsar.enums.typeLogement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Demande {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @ManyToOne
    private Ville ville;
    private typeLogement type;
    private int superficie ;
    private double budget;
    private String description;
    @ManyToOne
    Client client ;

}
