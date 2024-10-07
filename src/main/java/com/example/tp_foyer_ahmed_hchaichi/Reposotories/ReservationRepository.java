package com.example.tp_foyer_ahmed_hchaichi.Reposotories;

import com.example.tp_foyer_ahmed_hchaichi.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
    Reservation add(Reservation reservation);
}
