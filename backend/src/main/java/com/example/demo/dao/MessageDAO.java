package com.example.demo.dao;

import com.example.demo.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageDAO extends JpaRepository<Message,Integer> {
    @Override
    List<Message> findAll();

    @Query("select m from Message m where m.id_msg = ?1")
    Message findMessageById_msg(int id_msg);

    @Query("select m from Message m where m.sender = ?1")
    Message findMessageBySender(int sender);

    @Query("select m from Message m where m.receiver = ?1")
    Message findMessageByReceiver(int receiver);
}
