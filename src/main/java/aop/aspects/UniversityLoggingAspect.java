package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* aop.University.getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов" +
                " перед методом getStudents");
    }

    @AfterReturning(pointcut = "execution(* aop.University.getStudents())",
            returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student student = students.get(0);
        String nameSurname = student.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        student.setNameSurname(nameSurname);
        double avgGrade = student.getAvgGrade();
        avgGrade++;
        student.setAvgGrade(avgGrade);
        System.out.println("afterReturningGetStudentsLoggingAdvice: логируем получение списка студентов" +
                " после метода getStudents");
    }

    @AfterThrowing(pointcut = "execution(* aop.University.getStudents())",
            throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Exception exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: Логируем после выброса исключения" +
                exception);
    }
}
