package com.example.demo.controller;

import com.example.demo.model.Friend;
import com.example.demo.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
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
