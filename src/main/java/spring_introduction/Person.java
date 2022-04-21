package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBeen")
public class Person {

    private Pet pet;
    private String surname;
    private int age;

    public Person() {
        System.out.println("Person been is created");
    }

    //    @Autowired
//    public Person(Pet pet) {
//        System.out.println("Person been is created");
//        this.pet = pet;
//    }
//    @Autowired
//    public void setPet(Pet pet) {
//        System.out.println("Class Person: set pet");
//        this.pet = pet;
//    }
    @Autowired
    public void anyMethod(Pet pet) {
        System.out.println("Class Person: anyMethod pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callMyPet() {
        System.out.println("Hello, me lovely pet!");
        pet.say();
    }
}
