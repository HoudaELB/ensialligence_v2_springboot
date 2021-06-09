package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.JaimeDAO;
import com.example.demo.model.Jaime;
import com.example.demo.services.JaimeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JaimeTest {
	
	@Autowired
	JaimeService service;
	
	@MockBean
	JaimeDAO dao;
	
	@Test
	public void addJaimeTest() {
		Jaime f = new Jaime(70,1,1);
		when(dao.save(f)).thenReturn(f);
		assertEquals(f,service.addJaime(f));
	}

}
