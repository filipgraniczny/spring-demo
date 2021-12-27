package com.filipgraniczny.springdemo.api;

import com.filipgraniczny.springdemo.model.Person;
import com.filipgraniczny.springdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// GET - retrieve data from server
// POST - adding resource to server
// PUT - modifying resource on server
// DELETE - deleting resource from server

// sets the endpoint URL
@RequestMapping("api/v1/person")
// allows methods in class to respond to REST calls
@RestController
public class PersonController {

    private final PersonService personService;

    // @Autowired injects the PersonService into the constructor
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

}
