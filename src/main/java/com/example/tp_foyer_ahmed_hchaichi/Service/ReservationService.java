package com.example.tp_foyer_ahmed_hchaichi.Service;

import com.example.tp_foyer_ahmed_hchaichi.Entities.Reservation;
import com.example.tp_foyer_ahmed_hchaichi.Reposotories.ReservationRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;


@Getter
@Setter
@Service // Annotation to indicate that this class is a service
@AllArgsConstructor
public class ReservationService {

    ReservationRepository reservationRepository;

    public Reservation addReservation(Reservation reservation){
        return  reservationRepository.save(reservation);
    }
    public Reservation updatereservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deletReservation(Reservation reservation) {
        reservationRepository.delete(reservation);
    }

    public void deleteReservationbyid(Long id) {
        reservationRepository.deleteById(id);
    }

    public void deletall() {
        reservationRepository.deleteAll();
    }


}
