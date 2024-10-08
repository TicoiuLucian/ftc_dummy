package ro.ftc.restcontroller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.ftc.entity.Person;
import ro.ftc.service.IPersonService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
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

}
