package by.kirill.springboot.nagruzka.controllers;

import by.kirill.springboot.nagruzka.models.Grp;
import by.kirill.springboot.nagruzka.repository.GrpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GrpController {
    private GrpRepo grpRepo;

    @Autowired
    public GrpController(GrpRepo grpRepo) {
        this.grpRepo = grpRepo;
    }

    @GetMapping("/groups")
    public String showGroups(Model model){
        Iterable<Grp> grpList = grpRepo.findAll();
        model.addAttribute("grpList", grpList);
        return "groups";
    }
    @PostMapping("/addGroup")
    public String addGroups(@RequestParam String name, Model model){
        Grp grp = new Grp();
        grp.setName(name);
        grpRepo.save(grp);
        Iterable<Grp> grpList = grpRepo.findAll();
        model.addAttribute("grpList", grpList);
        return "redirect:/groups";
    }
    @PostMapping("/deleteGroup")
    public String deleteGroup(@RequestParam long id, Model model){
        Grp grp = grpRepo.findById(id);
        grpRepo.delete(grp);
        Iterable<Grp> grpList = grpRepo.findAll();
        model.addAttribute("grpList", grpList);
        return "redirect:/groups";
    }
}
