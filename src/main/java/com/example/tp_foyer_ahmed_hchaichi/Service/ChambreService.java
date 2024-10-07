package com.example.tp_foyer_ahmed_hchaichi.Service;

import com.example.tp_foyer_ahmed_hchaichi.Entities.Chambre;
import com.example.tp_foyer_ahmed_hchaichi.Reposotories.ChambreRepository;

public class ChambreService {

    ChambreRepository ChambreRepository;

    public Chambre addBloc(Chambre chambre){

        return ChambreRepository.save(chambre);
    }

    public Chambre updateBloc(Chambre chambre){
        return ChambreRepository.save(chambre);
    }
    public void deletUser(Chambre chambre){
        ChambreRepository.delete(chambre);
    }
    public void deleteuserbyid(long id){
        ChambreRepository.deleteById(id);
    }

    public void deletall(){
        ChambreRepository.deleteAll();
    }


}
