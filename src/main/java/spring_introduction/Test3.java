package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("MyPerson", Person.class);
        person.callMyPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
