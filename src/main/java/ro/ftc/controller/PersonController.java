package ro.ftc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ro.ftc.entity.Person;
import ro.ftc.service.IPersonService;

import java.util.List;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class PersonController {
    private final IPersonService personService;

    @GetMapping("/persons/all")
    public String getAllPersons(final Model model) {
        List<Person> persons = personService.findAll();
        model.addAttribute("persons", persons);
        return "all-persons";
    }
    @GetMapping("/person")
    public String showPersonForm(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "add-person";
    }

    @PostMapping("/person")
    public String addPerson(@ModelAttribute Person person) {
        personService.save(person);
        return "redirect:/all-persons";
    }

//    @GetMapping("/delete-person/{personId}")
//    public String deletePerson(@PathVariable Long personId, RedirectAttributes redirectAttributes) {
//        try {
//            personService.deletePerson(Math.toIntExact(personId));
//            return "redirect:/persons/all";
//        } catch (Exception e) {
//            e.printStackTrace();
//            redirectAttributes.addFlashAttribute("errorMessage", "An error occurred while deleting the person.");
//            return "redirect:/error";
//        }
//    }
}
