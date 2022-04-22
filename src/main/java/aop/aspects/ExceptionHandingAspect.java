package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect()
@Order(30)
public class ExceptionHandingAspect {

    @Before("aop.aspects.MyPointcuts.allGetters()")
    public void beforeGetAcceptingHandlingAdvice() {
        System.out.println("beforeGetAcceptingHandlingAdvice: ловим обрабатываем исключения"
                + " при попытке получить книгу/журнал");
    }
}
