package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAOs.FriendDAO;
import com.example.demo.models.Friend;

@Service
public class FriendService {

	@Autowired
	FriendDAO friendDAO;

    public Friend addFriend(Friend friend){
        return friendDAO.save(friend);
    }

    public List<Friend> getFriends(){
        return friendDAO.findAll();
    }

    public Friend getFriendById(int id){
        return friendDAO.findFriendByIdFriend(id);
    }

    public Friend getFriendByIdUser1(int idUser1){
        return friendDAO.findFriendByIdUser1(idUser1);
    }

    public Friend getFriendByIdUser2(int idUser2){
        return friendDAO.findFriendByIdUser2(idUser2);
    }
    
    public Friend update(Friend friend){
         return friendDAO.save(friend);
    }

    public String deleteFriendById(int id){
    	friendDAO.deleteById(id);
        return "Friend "+id+" is deleted successfully";
    }
    
    public String deleteAllFriends(){
    	friendDAO.deleteAll();
        return "All Friends are deleted successfully";
    }

	
}
