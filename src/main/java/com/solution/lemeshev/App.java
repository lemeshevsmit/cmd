package com.solution.lemeshev;

import com.solution.lemeshev.entity.Person;
import com.solution.lemeshev.entity.enums.Role;
import com.solution.lemeshev.service.PersonService;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersonService service = new PersonService();
        System.out.println( "List of person:" );
        service.show().forEach(System.out::println);
        Person newPerson = new Person(null, "Ernest", "Sokolov",
                LocalDate.of(1975, 9, 20), Role.ADMIN);
        service.addPerson(newPerson);
        System.out.println(service.showPerson(6));
    }
}
