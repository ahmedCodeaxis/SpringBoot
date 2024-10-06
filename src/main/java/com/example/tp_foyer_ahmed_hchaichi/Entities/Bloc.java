package com.example.tp_foyer_ahmed_hchaichi.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;


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

@ManyToOne
    private Foyer foyer;

    @OneToMany(mappedBy = "blcham")
    private Set<Chambre> chambre;












}
