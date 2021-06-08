package com.example.demo.controllersFront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {

    @GetMapping
    public String pageAccueil(){
        return "Accueil";
    }

    /*@GetMapping("/Home")
    public String pageHome(){
        return "Home";
    }*/
}
