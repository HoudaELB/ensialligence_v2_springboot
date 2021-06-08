package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Message;
import com.example.demo.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
@CrossOrigin(origins ="*")
public class MessageController {
    @Autowired
    public MessageService messageService;


    @GetMapping("/getMessages")
    public List<Message> getMessages(){
        return messageService.getMessages();
    }

    @GetMapping("/getMessageById/{id}")
    public Message getMessageById(@PathVariable int id){
        return messageService.getMessageById(id);
    }

    @GetMapping("/getMessageByIdSender/{titre}")
    public Message getMessageByIdSender(@PathVariable int idSender){
        return messageService.getMessageByIdSender(idSender);
    }

    @GetMapping("/getMessageByIdReceiver/{idReceiver}")
    public Message getMessageByIdReceiver(@PathVariable int idReceiver){
        return messageService.getMessageByIdReceiver(idReceiver);
    }

    @PostMapping("/saveMessage")
    public Message saveMessage(Message msg){
        return messageService.addMessage(msg);
    }

    @PutMapping("/updateMessage")
    public Message updateMessage(Message msg){
        return messageService.update(msg);
    }

    @DeleteMapping("/deleteMessage/{id}")
    public String deleteMessage(@PathVariable int  id){
        return messageService.deleteMessageById(id);
    }

    @DeleteMapping("/deleteAllMessages")
    public String deleteAll(){
        return messageService.deleteAllMessages();
    }
}
