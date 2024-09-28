package org.hogwards.spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person {
    Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(Pet pet) {
        this.pet = pet;
        System.out.println("Person is created");
    }

    public void callYourPet() {
        System.out.println("Hello my pet!!!");
        pet.say();
    }
}
