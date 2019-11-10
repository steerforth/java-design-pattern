package com.steer.design.proxy.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StudentProxy implements InvocationHandler {
    private Person person;

    public Object newInstance(Person person){
        this.person = person;
        //需要传入的参数是实现类，person.getClass().getInterfaces()
        return Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("class:"+proxy.getClass()+"===begin====  method:"+method.getName());
        if (proxy instanceof Person){
            if (method.getName().equals("buy")){
                System.out.println("调用前");
                Object obj = method.invoke(person,args);
                System.out.println("调用后");
                return obj;
            }
        }
        System.out.println(proxy.getClass()+"===end===="+method.getName());
        return method.invoke(person,args);
    }
}
