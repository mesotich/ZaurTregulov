package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBeen", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
//        person.callMyPet();

        context.close();
    }
}