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

import com.example.demo.dao.MessageDAO;
import com.example.demo.model.Message;
import com.example.demo.services.MessageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageTest {

	@Autowired
	MessageService service;
	
	@MockBean
	MessageDAO dao;
	
	@Test
	public void getMessagesTest() {
		when(dao.findAll()).thenReturn(Stream.
				of(new Message(20,"msg","06/09/2021",false,1,1), new Message(22,"msg","06/09/2021",false,1,1))
				.collect(Collectors.toList()));
		assertEquals(2,service.getMessages().size());
	}
	
	@Test
	public void addMessagesTest() {
		Message f = new Message(70,"msg","06/09/2021",false,1,1);
		when(dao.save(f)).thenReturn(f);
		assertEquals(f,service.addMessage(f));
	}
	
}
