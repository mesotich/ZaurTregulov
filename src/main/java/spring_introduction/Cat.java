package spring_introduction;

import org.springframework.stereotype.Component;

@Component("catBeen")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat been is created");
    }

    @Override
    public void say() {
        System.out.println("Мяу-мяу");
    }
}
