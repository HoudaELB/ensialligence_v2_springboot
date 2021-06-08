package com.example.demo.controllers;

import com.example.demo.models.Group;
import com.example.demo.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins ="*")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping("/getGroups")
    public List<Group> getGroups(){

        return groupService.getGroups();
    }

    @GetMapping("/getGroupByName/{GroupName}")
    public Group getGroupByName(@PathVariable String GroupName){
        return groupService.getGroupByName(GroupName);
    }

    @GetMapping("/getGroupByID/{idGroup}")
    public Group getGroupById(@PathVariable int idGroup){
        return groupService.getGroupById(idGroup);
    }

    @GetMapping("/getGroupByAdmin/{AdminName}")
    public Group getGroupByAdmin(@PathVariable String AdminName){
        return groupService.getGroupByAdmin(AdminName);
    }


    @PostMapping("/saveGroup")
    public Group saveGroupe(Group group){
      return groupService.create(group);
    }

    @PutMapping("/updateGroup")
    public Group updateGroupe(int idGroup,Group group){
        return groupService.update(idGroup,group);
    }

    @DeleteMapping("/deleteAllGroupes")
    public String deleteAll(){
        return groupService.deleteAllGroup();
    }
    @DeleteMapping("/deleteGroup/{idGroup}")
    public String deleteGroup(@PathVariable int  idGroup){
        return groupService.deleteGroupById(idGroup);
    }
}
