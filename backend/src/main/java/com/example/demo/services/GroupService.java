package com.example.demo.services;

import com.example.demo.dao.GroupDAO;
import com.example.demo.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    @Autowired
    private GroupDAO groupDAO;

    public Group create(Group group){
        return groupDAO.save(group);
    }

    public List<Group> getGroups(){
        return groupDAO.findAll();
    }

    public Group getGroupById(int idgroup){
        return groupDAO.findById(idgroup);
    }
    public Group getGroupByName(String GroupName){
        return groupDAO.findByGroupName(GroupName);
    }
    public Group getGroupByAdmin(String AdminName){
        return groupDAO.findByAdminName(AdminName);
    }
    public Group update(int idGroup,Group group){
        group.setIdGroup(idGroup);
        return groupDAO.save(group);
    }

    public String deleteGroupById(int idGroup){
        groupDAO.deleteById(idGroup);
        return "Group "+idGroup+" is deleted successfully";
    }
    public String deleteAllGroup(){
        groupDAO.deleteAll();
        return "All Groupes are deleted successfully";
    }

}
