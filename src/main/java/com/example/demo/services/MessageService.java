package com.example.demo.services;


import com.example.demo.dao.MessageDAO;
import com.example.demo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return messageDAO.findMessageById_msg(id);
    }

    public Message getMessageByIdSender(int idSender){
        return messageDAO.findMessageBySender(idSender);
    }

    public Message getMessageByIdReceiver(int idReceiver){
        return messageDAO.findMessageBySender(idReceiver);
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
