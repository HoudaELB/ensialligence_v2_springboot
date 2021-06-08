package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Jaime;

import java.util.List;

@Repository
public interface JaimeDAO extends JpaRepository<Jaime,Integer> {

    @Override
    List<Jaime> findAll();
}
