package kz.ermek.Project2SpringBoot.repositories;

import kz.ermek.Project2SpringBoot.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> getPersonByFio(String fio);


}
