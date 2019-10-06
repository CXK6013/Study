package com.cxk.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author XingKe
 * @date 2019-06-05 11:06
 */
public class DaoProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("在方法执行之前调用");
        methodProxy.invokeSuper(o,objects);
        System.out.println("在方法执行之后调用");
        return null;
    }
}
