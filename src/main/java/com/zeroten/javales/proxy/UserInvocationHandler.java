/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： UserInvocationHandler.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//jDK 动态代理,事件处理器 实现接口 InvocationHandler
public class UserInvocationHandler implements InvocationHandler {
    public Object object;

    public UserInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行");
        if (args != null && args.length == 1) {
            if (args[0] instanceof User) {
                System.out.println("参数1是User");
                User user = (User) args[0];
                if (user.getName() == null || user.getName().length() == 0) {
                    System.out.println("姓名为空,不保存");
                    return false;
                }
                if (user.getAge() == null || user.getAge() < 0 || user.getAge() > 200) {
                    System.out.println("年龄不能小于0,不保存");
                    return false;
                }
            }
        }
        Object result = method.invoke(object, args);
        System.out.println("执行结束");
        return result;
    }
}
