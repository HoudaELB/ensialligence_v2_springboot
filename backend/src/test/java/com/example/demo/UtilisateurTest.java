package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.UtilisateurDAO;
import com.example.demo.model.Utilisateur;
import com.example.demo.services.UtilisateurService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilisateurTest {

	@Autowired
	UtilisateurService service;
	
	@MockBean
	UtilisateurDAO dao;
	
	@Test
	public void getUtilisateursTest() {
		when(dao.findAll()).thenReturn(Stream.
				of(new Utilisateur(20,"houda","140320","Houda","EL BIACHE","houdaelbiache@gmail.com","18/01/2000"), new Utilisateur(22,"houda","140320","Houda","EL BIACHE","houdaelbiache@gmail.com","18/01/2000"))
				.collect(Collectors.toList()));
		assertEquals(2,service.getUtilisateurs().size());
	}
	
	@Test
	public void addUtilisateurTest() {
		Utilisateur f = new Utilisateur(70,"houda","140320","Houda","EL BIACHE","houdaelbiache@gmail.com","18/01/2000");
		when(dao.save(f)).thenReturn(f);
		assertEquals(f,service.createUtilisateur(f));
	}

}
