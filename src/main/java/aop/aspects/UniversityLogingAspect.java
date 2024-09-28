package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLogingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsMethod() {
        System.out.println("beforeGetStudentsMethod: логируем получение списка студентов." +
                "перед методом getStudents.");
    }

//    @AfterReturning(pointcut = ("execution(* getStudents())"), returning = "students")
//    public void afterReturningGetStudentsMethod(List<Student> students) {
//        Student st1 = students.get(0);
//        String name = st1.getNameSurname();
//        double ball = st1.getAvgGrade();
//        st1.setNameSurname("Mr." + name);
//        st1.setAvgGrade(ball + 1);
//
//        System.out.println("afterReturningGetStudentsMethod: после метода getStudents.");
//    }
//
//    @AfterThrowing(pointcut = ("execution(* getStudents())"), throwing = "throwing")
//    public void afterThrowingGetStudents(Throwable throwing) {
//        System.out.println("afterThrowingGetStudents: логируем исключение: " + throwing);
//    }

    @After("execution(* get*(..))")
    public void afterGetMethod() {
        System.out.println("afterGetMethod: выполняется после метода гет, вне зависимоти завершился он с ошибкой " +
                "или завершился правильно!!!");
    }

}
