package com.filipgraniczny.springdemo.service;

import com.filipgraniczny.springdemo.dao.PersonDao;
import com.filipgraniczny.springdemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// tells Spring that this class is a service.
@Service
public class PersonService {
    // here we will simply have a method to insert a new person using the PersonDao
    private final PersonDao personDao;

    // we are autowiring into the "PersonDao" interface
    // bc there are multiple implementations of the PersonDao interface, we must have a way to distinguish between them.
    // we use @Qualifier("fakeDao") to identify the one we want to inject. We specify the name in the repository class
    // by adding ("fakeDao") to @Repository("fakeDao"). We could easily change which DB we're using by changing the repository class
    // from "fakeDao" to say "mongo", etc.
    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
