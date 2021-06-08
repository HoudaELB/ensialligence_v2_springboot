package com.example.demo.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Participant;

import java.util.List;

@Repository
public interface ParticipantDAO extends JpaRepository<Participant,Integer> {
    @Override
    List<Participant> findAll();
}
