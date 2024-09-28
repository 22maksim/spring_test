package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExeptionHundlyAspect {
    @Before("aop.aspects.MyPointcuts.pointcut_reference()")
    public void beforeAddMethodStart(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSygnature: " + methodSignature);
        System.out.println("MethodSygnature getMethod: " + methodSignature.getMethod());
        System.out.println("MethodSygnature getName: " + methodSignature.getName());
        System.out.println("MethodSygnature getReturnType: " + methodSignature.getReturnType());

        System.out.println("Start Add method----3-----");
    }
}
