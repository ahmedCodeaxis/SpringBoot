package com.example.tp_foyer_ahmed_hchaichi.Controller;

import com.example.tp_foyer_ahmed_hchaichi.Entities.Bloc;
import com.example.tp_foyer_ahmed_hchaichi.Service.BlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/blocs")
public class BlocController {

    @Autowired
    private BlocService blocService;

    @PostMapping
    public Bloc createBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }
}
