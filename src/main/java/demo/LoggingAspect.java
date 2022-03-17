package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //we need to define when and which location it has to be run
    //we need to use pointcut(before,after etc)

    @Before("execution(* demo.CarDealerShip.buyCar(..))")
    public void beforeLogger(JoinPoint jp) {
        jp.getSignature();
        System.out.println("Signature of method "+jp.getSignature());
        System.out.println("Get arguments "+jp.getArgs()[0].toString());
        System.out.println("Before Loggers");
    }

    @After("execution(* demo.CarDealerShip.buyCar())")
    public void AfterLogger() {
        System.out.println(" After Loggers");
    }

    @Pointcut("execution(* demo.CarDealerShip.price())")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "returnedVal")
    public void afterReturning(String returnedVal) {
        System.out.println("After Returning "+returnedVal);
    }
}
