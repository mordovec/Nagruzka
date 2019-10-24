package by.kirill.springboot.nagruzka.controllers;

import by.kirill.springboot.nagruzka.models.Capasity;
import by.kirill.springboot.nagruzka.models.Grp;
import by.kirill.springboot.nagruzka.models.Teacher;
import by.kirill.springboot.nagruzka.repository.CapasityRepo;
import by.kirill.springboot.nagruzka.repository.GrpRepo;
import by.kirill.springboot.nagruzka.repository.SubjectRepo;
import by.kirill.springboot.nagruzka.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CapasityController {
    private CapasityRepo capasityRepo;
    private GrpRepo grpRepo;
    private TeacherRepo teacherRepo;
    private SubjectRepo subjectRepo;

    @Autowired
    public CapasityController(CapasityRepo capasityRepo, GrpRepo grpRepo, TeacherRepo teacherRepo, SubjectRepo subjectRepo) {
        this.capasityRepo = capasityRepo;
        this.grpRepo = grpRepo;
        this.teacherRepo = teacherRepo;
        this.subjectRepo = subjectRepo;
    }


    @GetMapping("/capasity")
    public String showCapasity(Model model){
        Iterable<Capasity> listCapasity = capasityRepo.findAll();
        Iterable<Teacher> listTeacher = teacherRepo.findAll();
        model.addAttribute("listCapasity", listCapasity);
        model.addAttribute("listTeacher", listTeacher);
        return "capasity";
    }
    @PostMapping("/addCapasity")
    public String addCapasity(@RequestParam long grp, long teacher, long subject, long po_uch_pl, Model model){
        Capasity capasity = new Capasity();
        capasity.setGrp(grpRepo.findById(grp));
        capasity.setTeacher(teacherRepo.findById(teacher));
        capasity.setSubject((subjectRepo.findById(subject)));
        capasity.setPo_uch_pl(po_uch_pl);
        capasityRepo.save(capasity);
        Iterable<Capasity> listCapasity = capasityRepo.findAll();
        model.addAttribute("listCapasity", listCapasity);
        return "redirect:capasity";

    }
}
