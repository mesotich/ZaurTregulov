package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog been is created");
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
////    }
//    @PostConstruct
//    public void init() {
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("Class Dog: destroy method");
//    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
