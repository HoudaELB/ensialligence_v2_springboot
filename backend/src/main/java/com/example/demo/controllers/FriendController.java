package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Friend;
import com.example.demo.services.FriendService;

@RestController
@RequestMapping
@CrossOrigin(origins ="*")
public class FriendController {

	@Autowired
    public FriendService friendService;

    @GetMapping("/getFriends")
    public List<Friend> getAFriends(){
        return friendService.getFriends();
    }

    @GetMapping("/getFriendById/{id}")
    public Friend getFriendById(@PathVariable int id){
        return friendService.getFriendById(id);
    }

    @GetMapping("/getFriendByIdUser1/{titre}")
    public Friend getFriendByIdUser1(@PathVariable int id){
        return friendService.getFriendByIdUser1(id);
    }
    
    @GetMapping("/getFriendByIdUser2/{Categorie}")
    public Friend getFriendByIdUser2(@PathVariable int id){
        return friendService.getFriendByIdUser2(id);
    }
	
    @PostMapping("/saveFriend")
    public Friend saveFriend(Friend friend){
        return friendService.addFriend(friend);
    }
    
    @PutMapping("/updateFriend")
    public Friend updateFriend(Friend friend){
        return friendService.update(friend);
    }

    @DeleteMapping("/deleteFriend/{id}")
    public String deleteFriend(@PathVariable int  id){
        return friendService.deleteFriendById(id);
    }
    
    @DeleteMapping("/deleteAllFriends")
    public String deleteAllFriends(){
        return friendService.deleteAllFriends();
    }
    
}
