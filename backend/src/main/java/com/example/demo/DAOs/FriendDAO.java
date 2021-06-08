package com.example.demo.DAOs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Friend;

public interface FriendDAO extends JpaRepository<Friend,Integer> {

	@Override
    List<Friend> findAll();
	
	@Query("select f from Friend f where f.idFriend = ?1")
	Friend findFriendByIdFriend(int id_user);

    @Query("select f from Friend f where f.idUser1 like %?1%")
    Friend findFriendByIdUser1(int idUser1);

    @Query("select f from Friend f where f.idUser2 like %?1%")
    Friend findFriendByIdUser2(int idUser2);
	
}
