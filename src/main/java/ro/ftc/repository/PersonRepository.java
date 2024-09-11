package ro.ftc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.ftc.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
