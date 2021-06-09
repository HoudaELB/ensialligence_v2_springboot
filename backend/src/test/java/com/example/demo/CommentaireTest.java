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

import com.example.demo.dao.CommentaireDAO;
import com.example.demo.model.Commentaire;
import com.example.demo.services.CommentaireService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentaireTest {

	@Autowired
	CommentaireService service;
	
	@MockBean
	CommentaireDAO dao;
	
	@Test
	public void getCommentairesTest() {
		when(dao.findAll()).thenReturn(Stream.
				of(new Commentaire(20,1,1,"comment",0), new Commentaire(22,1,1,"test comment",1))
				.collect(Collectors.toList()));
		assertEquals(2,service.getCommentaires().size());
	}
	
	@Test
	public void createCommentairesTest() {
		Commentaire c = new Commentaire(70,1,1,"test test",0);
		when(dao.save(c)).thenReturn(c);
		assertEquals(c,service.addCommentaire(c));
	}

}
