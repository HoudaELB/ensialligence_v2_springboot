package com.example.demo.dao;

import com.example.demo.model.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendDAO extends JpaRepository<Friend,Integer> {
    @Override
    List<Friend> findAll();

    @Query("select f from Friend f where f.id_friend = ?1")
    Friend findFriendById_friend(int id_friend);

    @Query("select f from Friend f where f.id_user1 = ?1")
    Friend findFriendById_user1(int id_user1);

    @Query("select f from Friend f where f.id_user2 = ?1")
    Friend findFriendById_user2(int id_user2);
}
