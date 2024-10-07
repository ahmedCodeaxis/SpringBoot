package com.example.tp_foyer_ahmed_hchaichi.Reposotories;

import com.example.tp_foyer_ahmed_hchaichi.Entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}

