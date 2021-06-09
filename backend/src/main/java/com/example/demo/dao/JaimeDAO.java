package com.example.demo.dao;

import com.example.demo.model.Jaime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JaimeDAO extends JpaRepository<Jaime,Integer> {

    @Override
    List<Jaime> findAll();
}
