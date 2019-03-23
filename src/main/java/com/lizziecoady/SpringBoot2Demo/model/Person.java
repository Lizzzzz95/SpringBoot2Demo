package com.lizziecoady.SpringBoot2Demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class Person {

//    a UUID is a Universally Unique Identifier, e.g 123e4567-e89b-12d3-a456-556642440000
    private final UUID id;
    private final String name;

//    when we use postman, @JsonProperty will make spring recognise the parameters
    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
