package com.example.tp_foyer_ahmed_hchaichi.Entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Foyer")

public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDFoyer")

    long idFoyer;
    @Column(name = "nomFoyer")

    String nomFoyer;
    @Column(name = "capacitefoyer")

    long capacitefoyer;




}
