package com.example.tp_foyer_ahmed_hchaichi.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

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





}
