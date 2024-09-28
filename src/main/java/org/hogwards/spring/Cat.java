package org.hogwards.spring;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
        System.out.println("Cat is created");
    }

    @Override
    public void say() {
        System.out.println("Mau-Mau");
    }
}
