package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
//        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
        uniLibrary.getBook();
        uniLibrary.addBook("Zaur", book);
        uniLibrary.addMagazine();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        uniLibrary.returnBook();
//        schoolLibrary.getBook();
        context.close();
    }
}
