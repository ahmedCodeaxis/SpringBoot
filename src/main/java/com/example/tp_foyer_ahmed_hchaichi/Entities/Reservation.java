package com.example.tp_foyer_ahmed_hchaichi.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Reservation")
public class Reservation {

            @Id
            @Column(name = "Idreservation")
            String idReservation;
            @Column(name = "anneuniversitaire")
            LocalDate anneuniversitaire;
            @Column(name = "estValdie")

             boolean estValdie;

    @ManyToMany(mappedBy = "etRes")
    private Set<Etudiant> etudiants;




}
