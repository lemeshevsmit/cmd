package com.solution.lemeshev.database;

import com.solution.lemeshev.entity.Person;
import com.solution.lemeshev.entity.enums.Role;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private static Integer idGenerator = 0;
    private final List<Person> personList = new ArrayList<>();

    {
        personList.add( new Person(++idGenerator, "Ivan","Ivanov",LocalDate.of(2000, 10,23),Role.ADMIN));
        personList.add( new Person(++idGenerator, "Stepan","Bandera",LocalDate.of(1925, 5,12),Role.USER));
        personList.add( new Person(++idGenerator, "Vova","Piddubniu",LocalDate.of(1987, 7,1),Role.MODERATOR));
        personList.add( new Person(++idGenerator, "Oleg","Lyashko",LocalDate.of(1999, 4,17),Role.USER));
        personList.add( new Person(++idGenerator, "Taras","Shevchenko",LocalDate.of(2005, 1,29),Role.USER));
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public Person getById(int id) {
        return personList.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(null);
    }

    public void save(Person person) {
        person.setId(++idGenerator);
        personList.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = getById(id);

        personToBeUpdated.setFirstName(updatedPerson.getFirstName());
        personToBeUpdated.setLastName(updatedPerson.getLastName());
        personToBeUpdated.setBirthday(updatedPerson.getBirthday());
        personToBeUpdated.setRole(updatedPerson.getRole());
    }

    public void deleteById(int id) {
        personList.removeIf(p -> p.getId() == id);
    }
}
