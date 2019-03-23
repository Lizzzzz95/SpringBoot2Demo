package com.lizziecoady.SpringBoot2Demo.api;

import com.lizziecoady.SpringBoot2Demo.model.Person;
import com.lizziecoady.SpringBoot2Demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

//    This tells Spring that this is a post request
    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    //    This tells Spring that this is a get request
    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }
}
