package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBeen", Person.class);
        person.callMyPet();
//        Pet cat1 = context.getBean("catBeen", Pet.class);
//        Pet cat2 = context.getBean("catBeen", Pet.class);

  //      pet.say();
        context.close();
    }
}
