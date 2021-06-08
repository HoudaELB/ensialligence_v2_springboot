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

import com.example.demo.models.Message;
import com.example.demo.services.MessageService;

@RestController
@RequestMapping
@CrossOrigin(origins ="*")
public class MessageController {
	
	@Autowired
    public MessageService msgService;


    @GetMapping("/getMessages")
    public List<Message> getMessages(){
        return msgService.getMessages();
    }

    @GetMapping("/getMessageById/{id}")
    public Message getMessageById(@PathVariable int id){
        return msgService.getMessageById(id);
    }

    @GetMapping("/getMessageByIdSender/{titre}")
    public Message getMessageByIdSender(@PathVariable int idSender){
        return msgService.getMessageByIdSender(idSender);
    }
    
    @GetMapping("/getMessageByIdReceiver/{idReceiver}")
    public Message getMessageByIdReceiver(@PathVariable int idReceiver){
        return msgService.getMessageByIdReceiver(idReceiver);
    }
    
    @PostMapping("/saveMessage")
    public Message saveMessage(Message msg){
        return msgService.addMessage(msg);
    }

    @PutMapping("/updateMessage")
    public Message updateMessage(Message msg){
        return msgService.update(msg);
    }
    
    @DeleteMapping("/deleteMessage/{id}")
    public String deleteMessage(@PathVariable int  id){
        return msgService.deleteMessageById(id);
    }

    @DeleteMapping("/deleteAllMessages")
    public String deleteAll(){
        return msgService.deleteAllMessages();
    }

}
