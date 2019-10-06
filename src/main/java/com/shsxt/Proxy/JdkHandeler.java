package com.shsxt.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkHandeler implements InvocationHandler {

    /**
     * 创建一个动态代理对象
     */
    private Object object;


    public JdkHandeler(Object object) {
        this.object = object;
    }



    public Object getPorxy(){
        /**
         * 1.类加载器
         * 2.目标类实现的接口数组
         * 3.实现了InvocationHandler的类   this 当前类
         */
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(), this);

    }

    public void before(){
        System.out.println("马上要结婚了");
    }


    public void after(){
        System.out.println("结完了");
    }
    /**
     * proxy jdk自己控制
     * method   方法
     * args  方法的参数
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result =null;
        //执行目标对象方法 result 目标方法执行的结果
        before();
        result=method.invoke(object,args);
        after();
        return result;
    }


}
