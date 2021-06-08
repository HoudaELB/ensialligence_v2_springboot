package com.example.demo.DAOs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Message;

public interface MessageDAO extends JpaRepository<Message,Integer> {
	
	@Override
    List<Message> findAll();
	
	@Query("select m from Message m where m.idMessage = ?1")
    Message findMessageByIdMessage(int idMessage);

    @Query("select m from Message m where m.idSender like %?1%")
    Message findMessageByIdSender(int idSender);

    @Query("select m from Message m where m.idReceiver like %?1%")
    Message findMessageByIdReceiver(int idReceiver);

}
