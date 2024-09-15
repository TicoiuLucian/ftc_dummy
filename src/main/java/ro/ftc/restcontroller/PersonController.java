package ro.ftc.restcontroller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.ftc.entity.Person;
import ro.ftc.service.IPersonService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/person") //TOATE INCEP CU /PERSON !!!!!!!!!!!!!!!!!!!!! /PERSON/PARTICIPANTS
public class PersonController {

  private final IPersonService personService;

  @GetMapping("/all")
  public List<Person> findAll() {
    return personService.findAll();
  }

  @PostMapping
  public void save(@RequestBody Person person) {
    personService.save(person);
  }

  @GetMapping("/participants")
  public String viewParticipantsPage(final Model model) {
    List<Person> participants = personService.findAll();
    model.addAttribute("participants", participants);
    return "participants";
  }

}
