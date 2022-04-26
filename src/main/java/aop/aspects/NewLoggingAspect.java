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
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturningBookLoggingAdvice: было поймано исключение " + e);
            throw e;
        }
        System.out.println("aroundReturningBookLoggingAdvice: в библиотеку успешно вернули книгу");
        return targetMethodResult;
    }
}
