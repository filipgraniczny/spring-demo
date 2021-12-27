package com.filipgraniczny.springdemo.dao;

import com.filipgraniczny.springdemo.model.Person;

import java.util.List;
import java.util.UUID;

// Here, we define the operations allowed for the actual contract for anyone who wishes to implement this interface.
// Then we can use dependency injection to switch implementations with only one line of code.
public interface PersonDao {
    int  insertPerson(UUID id, Person person);

    /* Default classes allow interfaces to describe a default implementation of a method, similar
     to abstract classes */
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

}
