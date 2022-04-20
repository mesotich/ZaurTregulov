package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("MyPet",Pet.class);
        Person person = new Person(pet);
        person.callMyPet();
        context.close();
    }

}
