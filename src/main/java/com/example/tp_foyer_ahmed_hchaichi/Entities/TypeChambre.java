package com.example.tp_foyer_ahmed_hchaichi.Entities;

import jakarta.persistence.Column;

public enum TypeChambre {
    @Column(name = "TypeChambre")

    SIMPLE,DOUBLE,TRIPLE;

}
