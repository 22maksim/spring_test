package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LogginAspect {
    @Before("aop.aspects.MyPointcuts.pointcut_reference()")
    public void beforeAddBookAdvice() throws InterruptedException {
        System.out.println("Strart Add 2 method------1-------");
    }


}
