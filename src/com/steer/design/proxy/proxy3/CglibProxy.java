package com.steer.design.proxy.proxy3;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Object target;

    public Object newInstance(Object objectTarget){
        this.target = objectTarget;
        Enhancer enhancer = new Enhancer();
        //设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(objectTarget.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("AOP===  cglib监听开始,class==>"+obj.getClass()+" method proxy==>"+methodProxy.getClass()+"  method:"+method.getName());

        System.out.println("target class==>"+target.getClass()+"  -------"+target.getClass().isInstance(obj));

        Object result = method.invoke(target,args);
        System.out.println("AOP===  cglib监听结束,class==>"+obj.getClass()+" method proxy==>"+methodProxy.getClass()+"  method:"+method.getName());
        return result;
    }
}
