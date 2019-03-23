package com.lizziecoady.SpringBoot2Demo.dao;

import com.lizziecoady.SpringBoot2Demo.model.Person;

import java.util.*;

public interface PersonDao {

//    method that inserts a person with a given id
    int insertPerson(UUID id, Person person);

//    method that inserts a person without a given id (randomly generated)
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id,Person person);

}
