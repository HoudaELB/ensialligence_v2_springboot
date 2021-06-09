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

import com.example.demo.dao.FriendDAO;
import com.example.demo.model.Friend;
import com.example.demo.services.FriendService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FriendTest {

	@Autowired
	FriendService service;
	
	@MockBean
	FriendDAO dao;
	
	@Test
	public void getFriendsTest() {
		when(dao.findAll()).thenReturn(Stream.
				of(new Friend(20,1,1), new Friend(22,1,1))
				.collect(Collectors.toList()));
		assertEquals(2,service.getFriends().size());
	}
	
	@Test
	public void addFriendsTest() {
		Friend f = new Friend(70,1,1);
		when(dao.save(f)).thenReturn(f);
		assertEquals(f,service.addFriend(f));
	}


}
