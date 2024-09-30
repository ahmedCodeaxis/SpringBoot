package com.example.tp_foyer_ahmed_hchaichi.Entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Universite")

public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUniversite")

    long idUniversite;
    @Column(name = "nomUniversite")

    String nomUniversite;
    @Column(name = "adresse")

    String adresse;

    @OneToOne
    private Foyer foyer;

}
