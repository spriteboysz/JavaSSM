package org.deean.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Author: Deean
 * Date: 2023-11-11 20:03
 * FileName: src/main/java/org/deean/proxy
 * Description:
 */

public class CGLibDynamicProxy implements MethodInterceptor {
    private final Object object;

    public CGLibDynamicProxy(Object object) {
        this.object = object;
    }

    public Object getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        begin();
        Object invoke = method.invoke(object, objects);
        commit();
        return invoke;
    }

    public void begin() {
        System.out.println("---03开启事务---");
    }

    public void commit() {
        System.out.println("---03提交事务---");
    }
}
