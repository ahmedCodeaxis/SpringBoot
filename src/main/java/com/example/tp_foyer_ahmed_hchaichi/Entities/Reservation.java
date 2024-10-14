package com.example.tp_foyer_ahmed_hchaichi.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;
@Setter
@Getter
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
