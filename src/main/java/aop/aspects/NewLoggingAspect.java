package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object afterMethodGetBook(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("afterMethodGetBook: начинает работать метод AROUND после returnBook");
        long start = System.currentTimeMillis();
        Object procObject = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println("afterMethodGetBook: успешно сработал метод AROUND после returnBook");
        System.out.println(end - start);
        return  procObject;
    }
}
