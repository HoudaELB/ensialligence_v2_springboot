package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAOs.MessageDAO;
import com.example.demo.models.Message;

@Service
public class MessageService {
	
	@Autowired
    MessageDAO messageDAO;

    public Message addMessage(Message msg){
        return messageDAO.save(msg);
    }

    public List<Message> getMessages(){
        return messageDAO.findAll();
    }

    public Message getMessageById(int id){
        return messageDAO.findMessageByIdMessage(id);
    }

    public Message getMessageByIdSender(int idSender){
        return messageDAO.findMessageByIdSender(idSender);
    }

    public Message getMessageByIdReceiver(int idReceiver){
        return messageDAO.findMessageByIdReceiver(idReceiver);
    }
    
    public Message update(Message msg){
         return messageDAO.save(msg);
    }

    public String deleteMessageById(int id){
    	messageDAO.deleteById(id);
        return "Message "+id+" is deleted successfully";
    }
    
    public String deleteAllMessages(){
    	messageDAO.deleteAll();
        return "All Messages are deleted successfully";
    }


}
