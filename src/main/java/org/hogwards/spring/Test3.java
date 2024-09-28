package org.hogwards.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("applicationContext.xml");
            Person person = context.getBean("myPerson", Person.class);
            person.callYourPet();
            System.out.printf("%s -у сейчас %d", person.getSurname(), person.getAge());
            context.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
