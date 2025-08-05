package com.controllerfiles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootprograms.Student;

import jakarta.validation.Valid;
import java.util.List;

@Controller
public class StudentFormController {

    @GetMapping("/studentform")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());

        model.addAttribute("countryOptions", getCountryOptions());
        model.addAttribute("subjectOptions", getSubjectOptions());

        return "enrol";
    }

    @PostMapping("/submit")
    public String submitForm(@Valid @ModelAttribute("student") Student student,
                             BindingResult result,
                             Model model) {
        if (result.hasErrors()) {
            model.addAttribute("countryOptions", getCountryOptions());
            model.addAttribute("subjectOptions", getSubjectOptions());
            return "enrol";
        }
        model.addAttribute("student", student);

        return "studentsuccess";
    }

    private List<String> getCountryOptions() {
        return List.of("India", "USA", "UK", "Canada", "Australia");
    }

    private List<String> getSubjectOptions() {
        return List.of("Math", "Science", "English", "History", "Computer Science");
    }
}
