package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }

    public String getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
        return "ОК";
    }
}
