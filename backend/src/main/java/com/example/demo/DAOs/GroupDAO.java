package com.example.demo.DAOs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Group;

import java.util.List;
import java.util.Optional;

@Repository
public interface GroupDAO extends JpaRepository<Group,Integer> {
    @Override
    List<Group> findAll();

    @Query("select u from Group u where u.idGroup = ?1")
    Group findById(int id);

//    @Query("select u from Group u where u.GroupName = ?1")
    @Query("select u from Group u where u.GroupName like %?1%")
    Group findByGroupName(String GroupName);

    @Query("select u from Group u where u.Admin like %?1%")
    Group findByAdminName(String AdminName);
}
