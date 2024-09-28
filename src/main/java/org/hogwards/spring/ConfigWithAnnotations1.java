package org.hogwards.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person iAm = context.getBean("person", Person.class);
        iAm.callYourPet();

        System.out.println(iAm.getSurname());
        System.out.println(iAm.getAge());

        context.close();
    }
}
