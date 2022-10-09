package com.solution.lemeshev.service;

import com.solution.lemeshev.database.PersonRepository;
import com.solution.lemeshev.entity.Person;

import java.util.List;

public class PersonService {

    private final PersonRepository personRepository = new PersonRepository();

    public void addPerson(Person person){
        personRepository.save(person);
    }

    public void deletePerson(int id){
        personRepository.deleteById(id);
    }

    public void updatePerson(int id, Person person){
        personRepository.update(id,person);
    }

    public List<Person> show(){
        return personRepository.getPersonList();
    }

    public Person showPerson(int id){
        return personRepository.getById(id);
    }
}
