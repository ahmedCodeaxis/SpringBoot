package com.example.tp_foyer_ahmed_hchaichi.Service;

import com.example.tp_foyer_ahmed_hchaichi.Entities.Etudiant;
import com.example.tp_foyer_ahmed_hchaichi.Reposotories.EtudiantRepository;

public class EtudiantService {


    EtudiantRepository etudiantRepository;

    public Etudiant AddEtudiant(Etudiant etudiant){

        return etudiantRepository.save(etudiant);
    }

    public Etudiant updateEtudiant(Etudiant etudiant){
        return etudiantRepository.save(etudiant);
    }
    public void deletEtudiant(Etudiant etudiant){
        etudiantRepository.delete(etudiant);
    }
    public void deletetudiantbyid(long id){
        etudiantRepository.deleteById(id);
    }

    public void deletall(){
        etudiantRepository.deleteAll();
    }


}
