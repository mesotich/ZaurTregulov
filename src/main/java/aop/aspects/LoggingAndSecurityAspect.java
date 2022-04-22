package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {
    }

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {
    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsFromUniLibraryWithoutReturnMagazine() {
    }

    @Before("allMethodsFromUniLibraryWithoutReturnMagazine()")
    public void beforeGetLoggingAdvice() {
        System.out.println("allMethodsFromUniLibraryWithoutReturnMagazine: writing Log #10");
    }
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
//
//    @Before("allGetters()")//PointCut с Book и любым колличеством параметров
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetters()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//    }
////    @Before("execution(* returnBook())")
////    public void beforeReturnBookAdvice() {
////        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
////    }
}
