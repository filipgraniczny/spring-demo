package com.filipgraniczny.springdemo.dao;

import com.filipgraniczny.springdemo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// @Component would also work
// Tells spring this class needs to be instantiated as a bean so that we can inject it into other classes
// in other words, this class can be served as a repository
@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        // add person to the mock database
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
