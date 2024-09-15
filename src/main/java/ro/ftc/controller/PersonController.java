package ro.ftc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.ftc.entity.Person;
import ro.ftc.service.IPersonService;

import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class PersonController {
    private final IPersonService personService;

    @GetMapping("/persons/all")
    public String getAllTeams(final Model model) {
        List<Person> persons = personService.findAll();
        model.addAttribute("persons", persons);
        return "all-persons";
    }
    @GetMapping("/person")
    public String showTeamPerson(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "add-person";
    }

    @PostMapping("/person")
    public String addPerson(@ModelAttribute Person person) {
        personService.save(person);
        return "redirect:/all-persons";
    }
}