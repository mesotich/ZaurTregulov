package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("MyPet", Dog.class);
        Dog yourDog = context.getBean("MyPet", Dog.class);
        System.out.println("Переменные ссылаются на один и тотже объект? " + (myDog == yourDog));
        myDog.setName("Belka");
        yourDog.setName("Strelka");
        System.out.println("MyDog name = " + myDog.getName());
        System.out.println("YouDog name = " + yourDog.getName());
        context.close();
    }
}
