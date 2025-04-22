package com.merion.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.merion.core.Person;
import com.merion.service.PersonService;

public class App {
    private static PersonService personSerivce= new PersonService();

    public static void main(String [] args) throws JsonProcessingException {
        Person person = new Person();
        person.setFirstName("Joe");
        person.setLastName("Smith");
        System.out.println(person);

        String json = personSerivce.convert(person);
        System.out.println(json);

        Person freeJson = personSerivce.parse(json);
        System.out.println(freeJson);

    }
}
