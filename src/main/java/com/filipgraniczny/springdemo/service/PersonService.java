package com.filipgraniczny.springdemo.service;

import com.filipgraniczny.springdemo.dao.PersonDao;
import com.filipgraniczny.springdemo.model.Person;

public class PersonService {
    // here we will simply have a method to insert a new person using the PersonDao
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
