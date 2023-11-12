package org.deean.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Author: Deean
 * Date: 2023-11-12 22:47
 * FileName: src/main/java/org/deean/utils
 * Description:
 */

@Component
@Aspect
public class TransactionManager {
    @Pointcut("execution(* org.deean.dao.*.*(..))")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void begin() {
        System.out.println("---start transaction---");
    }

    @After("pointcut()")
    public void commit() {
        System.out.println("---commit transaction---");
    }

    @Around("pointcut()")
    public Object printExecuteTime(ProceedingJoinPoint point) {
        long time1 = System.currentTimeMillis();
        Object proceed;
        try {
            proceed = point.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("execute time: " + (time2 - time1) + "ms");
        return proceed;
    }
}
