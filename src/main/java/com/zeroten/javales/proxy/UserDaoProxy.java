/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： UserDaoProxy.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.proxy;

import java.util.List;

/**
 * 业务代理
 */
public class UserDaoProxy implements UserDao {
    private UserDao target;

    public UserDaoProxy(UserDao userDao) {
        this.target = userDao;
    }

    @Override
    public boolean save(User user) {
        if (user.getName() == null || user.getName().length() == 0) {
            System.out.println("姓名为空，不保存");
            return false;
        }
        if (user.getAge() == null || user.getAge() < 0 || user.getAge() > 200) {
            System.out.println("年龄不能小于0,不保存");
            return false;
        }
        return this.target.save(user);
    }

    @Override
    public List query() {
        return null;
    }

    @Override
    public boolean delete() {
        return true;
    }
}
