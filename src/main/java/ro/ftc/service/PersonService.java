package ro.ftc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.ftc.entity.Person;
import ro.ftc.repository.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService implements IPersonService {

    private final PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public void save(final Person person) {
        personRepository.save(person);
    }
}