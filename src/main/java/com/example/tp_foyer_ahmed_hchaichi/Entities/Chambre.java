package com.example.tp_foyer_ahmed_hchaichi.Entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "Chambre")

public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDchambre")

    private Long idChambre;
    @Column(name = "numeroChambre")

    private Long numeroChambre;


    @Enumerated(EnumType.STRING)
    TypeChambre typeC;

    @OneToMany
    Set<Reservation>res;

    @ManyToOne

    private Bloc blcham;








}



