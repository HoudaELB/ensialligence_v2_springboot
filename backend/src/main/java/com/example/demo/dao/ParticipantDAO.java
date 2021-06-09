package com.example.demo.dao;

import com.example.demo.model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParticipantDAO extends JpaRepository<Participant,Integer> {
    @Override
    List<Participant> findAll();
}
