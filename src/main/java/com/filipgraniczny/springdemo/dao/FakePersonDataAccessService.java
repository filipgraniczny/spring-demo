package com.filipgraniczny.springdemo.dao;

import com.filipgraniczny.springdemo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        // add person to the mock database
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
