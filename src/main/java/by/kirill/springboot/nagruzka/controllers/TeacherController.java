package by.kirill.springboot.nagruzka.controllers;

import by.kirill.springboot.nagruzka.models.Teacher;
import by.kirill.springboot.nagruzka.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private TeacherRepo teacherRepo;

    @GetMapping("/teachers")
    public String showTeachers(Model model){
        Iterable<Teacher> teacherList = teacherRepo.findAll();
        model.addAttribute("teacherList", teacherList);
        return "teachers";
    }
    @PostMapping("/addTeachers")
    public String addTeacher(@RequestParam String name, Model model){
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacherRepo.save(teacher);
        Iterable<Teacher> teacherList =teacherRepo.findAll();
        model.addAttribute("teacherList", teacherList);
        return "redirect:/teachers";
    }
    @PostMapping("/deleteTeacher")
    public String deleteTeacher(@RequestParam long id, Model model){
        Teacher teacher = new Teacher();

        teacher = teacherRepo.findById(id);
        teacherRepo.delete(teacher);
        Iterable<Teacher> teachers = teacherRepo.findAll();
        model.addAttribute("teachers", teachers);
        return "redirect:/teachers";
    }
}
