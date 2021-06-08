package com.example.demo.controller;

import com.example.demo.dao.JaimeDAO;
import com.example.demo.model.Article;
import com.example.demo.model.Jaime;
import com.example.demo.services.JaimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins ="*")
public class JaimeController {

    @Autowired
    JaimeService jaimeService;


    @PostMapping("/addJaime")
    public Jaime addJaime(Jaime jaime){
        return jaimeService.addJaime(jaime);
    }

    @DeleteMapping("/removeJaime")
    public void removeJaime(int id){
        jaimeService.removeJaime(id);
    }


}
