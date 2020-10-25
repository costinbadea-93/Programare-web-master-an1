package masteran1ex3.masteran1ex3.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Pointcut(value = "execution(* MyService.*(..))")
    public void operation(){}


//    @Before("operation()")
//    public void log(JoinPoint joinPoint){
//        System.out.println("Logging before " + joinPoint.getSignature().getName());
//    }

    @Around("operation()")
    public Object log(ProceedingJoinPoint joinPoint){
        System.out.println("Logging before " + joinPoint.getSignature().getName());
        try {
//            return joinPoint.proceed();
            return joinPoint.proceed(new Object[] {"Ionel"});
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
