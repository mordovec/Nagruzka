package by.kirill.springboot.nagruzka.controllers;

import by.kirill.springboot.nagruzka.models.Subject;
import by.kirill.springboot.nagruzka.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubjectController {
    private SubjectRepo subjectRepo;

    @Autowired
    public SubjectController(SubjectRepo subjectRepo) {
        this.subjectRepo = subjectRepo;
    }
    @GetMapping("/subjects")
    public String showSubject(Model model){
        Iterable<Subject> listSubject = subjectRepo.findAll();
        model.addAttribute("listSubject", listSubject);
        return "subjects";
    }
    @PostMapping("/addSubject")
    public String addSubject(@RequestParam String name, Model model){
        Subject subject = new Subject();
        subject.setName(name);
        subjectRepo.save(subject);
        Iterable<Subject> listSubject = subjectRepo.findAll();
        model.addAttribute("listSubject", listSubject);
        return "redirect:/subjects";
    }
    @PostMapping("/deleteSubject")
    public String deleteSubject(@RequestParam long id, Model model){
        Subject subject = subjectRepo.findById(id);
        subjectRepo.delete(subject);
        Iterable<Subject> listSubject = subjectRepo.findAll();
        model.addAttribute("listSubject", listSubject);
        return "redirect:/subjects";
    }

}
