package com.example.tp_foyer_ahmed_hchaichi.Service;

import com.example.tp_foyer_ahmed_hchaichi.Entities.Bloc;
import com.example.tp_foyer_ahmed_hchaichi.Reposotories.BlocRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service // Annotation to indicate that this class is a service
@AllArgsConstructor
public class BlocService {

    BlocRepository blocRepository;

        public Bloc addBloc(Bloc bloc){

            return blocRepository.save(bloc);
        }

        public Bloc updateBloc(Bloc bloc){
            return blocRepository.save(bloc);
        }
        public void deletUser(Bloc bloc){
             blocRepository.delete(bloc);
        }
        public void deleteuserbyid(long id){
            blocRepository.deleteById(id);
        }

        public void deletall(){
            blocRepository.deleteAll();
        }














}
