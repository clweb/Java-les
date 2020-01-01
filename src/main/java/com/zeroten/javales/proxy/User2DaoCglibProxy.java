/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： User2DaoCgligProxy.java
 * 模块说明：
 * 修改历史:
 * 2020-1-1 - cl- 创建。
 */

package com.zeroten.javales.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class User2DaoCglibProxy implements MethodInterceptor {
    private Object object;

    public User2DaoCglibProxy(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(object.getClass());
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始执行");
        Object result = method.invoke(object, objects);
        System.out.println("执行结束");
        return null;
    }
}
