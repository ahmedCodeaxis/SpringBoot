package com.example.tp_foyer_ahmed_hchaichi.Reposotories;
import com.example.tp_foyer_ahmed_hchaichi.Entities.Foyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}

