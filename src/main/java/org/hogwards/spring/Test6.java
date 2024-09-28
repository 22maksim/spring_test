package org.hogwards.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.printf( person.getSurname());
    }
}
