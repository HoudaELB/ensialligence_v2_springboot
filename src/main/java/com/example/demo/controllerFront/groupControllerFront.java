package com.example.demo.controllerFront;


import com.example.demo.models.Group;
import com.example.demo.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class groupControllerFront {


    @Autowired
    private GroupService groupService;

    @GetMapping("/Home")
    public String createGroupe(Model model){
        Group group = new Group();
        model.addAttribute("group",group);
        return "Home";
    }
    @PostMapping("/createGroup")
    public String saveGroup(@RequestBody Group group){
        groupService.create(group);
        return "redirect:/Home";

    }
}
