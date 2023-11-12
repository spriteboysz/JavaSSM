package org.deean.utils;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Date;

/**
 * Author: Deean
 * Date: 2023-11-12 20:55
 * FileName: src/main/java/org/deean/utils
 * Description:
 */

public class LogManager {
    // 环绕通知方法必须带指定类型参数，必须返回Object类型对象
    public Object printLog(ProceedingJoinPoint point) {
        System.out.println("---" + new Date() + " log before---");
        Object proceed;
        try {
            proceed = point.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println("---" + new Date() + "log after---");
        return proceed;
    }
}
