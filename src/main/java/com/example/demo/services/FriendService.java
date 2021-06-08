package com.example.demo.services;

import com.example.demo.dao.FriendDAO;
import com.example.demo.model.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return friendDAO.findFriendById_friend(id);
    }

    public Friend getFriendByIdUser1(int idUser1){
        return friendDAO.findFriendById_user1(idUser1);
    }

    public Friend getFriendByIdUser2(int idUser2){
        return friendDAO.findFriendById_user2(idUser2);
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
