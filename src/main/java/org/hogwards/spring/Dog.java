package org.hogwards.spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Dog implements Pet {
    private String name;
    public Dog(String name) {
        this.name = name;
        System.out.printf("%s is created %n", getName());
    }

    @Override
    public void say() {
        System.out.println("ГАВ ГАВ");
    }

//    public void init() {
//        System.out.println("Class Dog: init method");
//    }
//
//    public void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }
}
