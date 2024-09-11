package ro.ftc.service;

import ro.ftc.entity.Person;

import java.util.List;

public interface IPersonService {
    List<Person> findAll();

    void save(Person person);
}