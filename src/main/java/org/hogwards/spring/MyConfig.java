package org.hogwards.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("myApp.properties")
public class MyConfig {
    private final String nameCat = "Tomas";
    private final String nameDog = "Tuzik";

    @Bean
    Cat myCat() {
        return new Cat(nameCat);
    }

    @Bean
    Dog myDog() {
        return new Dog(nameDog);
    }

    @Bean
    Person myPerson() {
        return new Person(myDog());
    }

    @Bean
    Person yourPerson() {
        return new Person(myCat());
    }
}
