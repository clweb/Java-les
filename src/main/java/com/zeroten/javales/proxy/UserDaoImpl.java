/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： UserDaoImpl.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.proxy;

import java.util.List;

/**
 * 接口实现
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean save(User user) {
        System.out.println("保存用户,姓名：" + user.getName() + ",年龄：" + user.getAge());
        return true;
    }

    @Override
    public List query() {
        return null;
    }

    @Override
    public boolean delete() {
        System.out.println("执行删除");
        return true;
    }
}
