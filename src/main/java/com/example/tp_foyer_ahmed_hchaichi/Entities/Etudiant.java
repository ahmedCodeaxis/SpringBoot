package com.example.tp_foyer_ahmed_hchaichi.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Etudiant")

public class Etudiant implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEtudiant")

    long IdEtudiant;
    @Column(name = "nomEt")

    String nomEt;
    @Column(name = "prenomEt")

    String prenomEt;
    @Column(name = "cin")

//gi
    long cin;
    @Column(name = "ecole")

    String ecole;
    @Column(name = "Date naissance")

    LocalDate datedenaissance;


}
