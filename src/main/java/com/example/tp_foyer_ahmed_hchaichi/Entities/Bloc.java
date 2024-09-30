package com.example.tp_foyer_ahmed_hchaichi.Entities;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "Bloc")
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idbloc")
    long Idbloc;
    @Column(name = "NomBloc")

    String nomBloc;
    @Column(name = "Capacitebloc")

    long capaciteBloc;










}
