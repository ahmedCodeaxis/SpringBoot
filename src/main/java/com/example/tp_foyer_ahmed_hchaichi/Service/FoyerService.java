package com.example.tp_foyer_ahmed_hchaichi.Service;

import com.example.tp_foyer_ahmed_hchaichi.Entities.Foyer;
import com.example.tp_foyer_ahmed_hchaichi.Reposotories.FoyerRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;


@Getter
@Setter
@Service // Annotation to indicate that this class is a service
@AllArgsConstructor
public class FoyerService {

    FoyerRepository foyerRepository;

    public Foyer addfoyer(Foyer foyer) {

        return foyerRepository.save(foyer);
    }

    public Foyer updatefoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    public void deletFoyer(Foyer foyer) {
        foyerRepository.delete(foyer);
    }

    public void deletefoyerbyid(long id) {
        foyerRepository.deleteById(id);
    }

    public void deletall() {
        foyerRepository.deleteAll();
    }
}