package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String aop.UniLibrary.returnBook())")
    public Object aroundReturningBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturningBookLoggingAdvice: в библиотеку пытаются вернуть книгу");
        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "Преступление и наказание";
        long end = System.currentTimeMillis();
        System.out.println("aroundReturningBookLoggingAdvice: в библиотеку успешно вернули книгу");
        System.out.println("aroundReturningBookLoggingAdvice: метод returnBook выполнил работу " +
                "за "+(end-begin)+" ms");
        return targetMethodResult;
    }
}
