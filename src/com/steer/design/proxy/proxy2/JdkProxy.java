package com.steer.design.proxy.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
    //持有
    private Object target;

    public Object newInstance(Object object){
        this.target = object;
        //需要传入的参数是实现类，person.getClass().getInterfaces()
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("AOP=== jdk监听开始,class:"+proxy.getClass()+"  method:"+method.getName());

        Object result = method.invoke(target,args);

        System.out.println("AOP=== jdk监听结束,class:"+proxy.getClass()+"  method:"+method.getName());
        return result;
    }
}
