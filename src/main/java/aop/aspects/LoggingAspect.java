package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsFromUniLibraryWithoutReturnMagazine() {
//    }
//
//    @Before("allMethodsFromUniLibraryWithoutReturnMagazine()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("allMethodsFromUniLibraryWithoutReturnMagazine: writing Log #10");
//    }
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary()||allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetOrReturnLoggingAdvice() {
//        System.out.println("beforeGetOrReturnLoggingAdvice: writing Log #3");
//    }
//    @Pointcut("execution(* get*())")
//    private void allGetters() {
//    }

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        System.out.println("beforeAddLoggingAdvice: логирование попытки добавить книгу/журнал");
        System.out.println("--------------------------------------------------------");
        if ("addBook".equals(methodSignature.getName())) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments
            ) {
                if (obj instanceof Book) {
                    Book book = (Book) obj;
                    System.out.printf("Информация о книге: Название - %s, автор - %s, год издания - %d\n",
                            book.getName(), book.getAuthor(), book.getYearOfPublication());
                }
                if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавил - " + obj);
                }
            }
        }
    }
//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }
}
