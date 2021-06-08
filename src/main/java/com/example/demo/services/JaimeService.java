package com.example.demo.services;

import com.example.demo.DAOs.JaimeDAO;
import com.example.demo.models.Jaime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JaimeService {

    @Autowired
    JaimeDAO jaimeDAO;


    public Jaime addJaime(Jaime jaime) {
        return jaimeDAO.save(jaime);
    }
    public void removeJaime(int idJaime) {
        jaimeDAO.deleteById(idJaime);
    }
}
