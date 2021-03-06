package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Cat cat = context.getBean("catBeen", Cat.class);
//        cat.say();
        Person person = context.getBean("personBeen", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
