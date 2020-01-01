/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： UserService.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.proxy;

import java.lang.reflect.Proxy;

/**
 * 业务服务层
 * 基于接口来做时：接口命名以 Service为后缀
 * 接口实现命名以 ServiceImpl 为后缀
 */
public class UserService {
    public static void directCall() {
        User user1 = new User("张三", 22);
        new UserDaoImpl().save(user1);

        User user2 = new User("李四", 100);
        new UserDaoImpl().save(user2);

        User user3 = new User("张三", -10);
        new UserDaoImpl().save(user3);
    }

    public static void staticDirectCall() {
        User user1 = new User("张三", 255);
        UserDao userDao = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy(userDao);
        proxy.save(user1);
    }

    public static void jdkProxyCall() {
        User user1 = new User("张三", 10);
        UserDao userDao = new UserDaoImpl();
        UserInvocationHandler handler = new UserInvocationHandler(userDao);
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                handler
        );
        userDaoProxy.save(user1);
        userDaoProxy.delete();
    }

    public static void jdkProxyCall2() {
        User user2 = new User("张三", -1);
        User2Dao user2Dao = new User2Dao();

        UserInvocationHandler handler = new UserInvocationHandler(user2Dao);
        User2Dao user2DaoProxy = (User2Dao) Proxy.newProxyInstance(
                user2Dao.getClass().getClassLoader(),
                user2Dao.getClass().getInterfaces(),
                handler
        );
        user2Dao.save(user2);
    }

    public static void cglibProxyCall() {
        User user = new User("镇三山", -1);
        User2Dao user2Dao = new User2Dao();

        User2DaoCglibProxy cglibProxy = new User2DaoCglibProxy(user2Dao);
        User2Dao user2DaoProxy = (User2Dao) cglibProxy.getProxyInstance();
        user2DaoProxy.save(user);

        UserDao userDao = new UserDaoImpl();
        User2DaoCglibProxy cglib2 = new User2DaoCglibProxy(userDao);
        UserDao userDaoProxy = (UserDao) cglib2.getProxyInstance();
//        userDaoProxy.save(user);
    }

    public static void main(String[] args) {
        //直接调用
        //directCall();

        //1.静态代理
//        staticDirectCall();

        //2.动态代理
//        jdkProxyCall();

        //2.动态代理 - 被代理对象不是基于接口来实现
//        jdkProxyCall2();

        //3.Cglib 代理,因为它是通过字类的方式来实现的,因此称为子类代理
        cglibProxyCall();
    }
}
