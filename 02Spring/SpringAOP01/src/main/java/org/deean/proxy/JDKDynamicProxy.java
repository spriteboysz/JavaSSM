package org.deean.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author: Deean
 * Date: 2023-11-11 19:45
 * FileName: src/main/java/org/deean/proxy
 * Description:
 */

public class JDKDynamicProxy implements InvocationHandler {
    private final Object object;

    public JDKDynamicProxy(Object object) {
        this.object = object;
    }

    public Object getProxy() {
        ClassLoader classLoader = object.getClass().getClassLoader();
        Class<?>[] interfaces = object.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        begin();
        Object invoke = method.invoke(object, args);
        commit();
        return invoke;
    }

    public void begin() {
        System.out.println("\n---02开启事务---");
    }

    public void commit() {
        System.out.println("---02提交事务---");
    }
}
