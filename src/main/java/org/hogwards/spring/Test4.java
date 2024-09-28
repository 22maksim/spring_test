package org.hogwards.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        System.out.println("объекты создаём по запросу");
        Dog dog1 = context.getBean("myPet", Dog.class);
        Dog dog2 = context.getBean("myPet", Dog.class);
        System.out.printf("%s равен %s? %b \n", dog1.getName(), dog2.getName(), (dog2 == dog1));
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
