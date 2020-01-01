/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： User2Dao.java
 * 模块说明：
 * 修改历史:
 * 2020-1-1 - cl- 创建。
 */

package com.zeroten.javales.proxy;

public class User2Dao {
    public boolean save(User user) {
        System.out.println("保存用户2：" + user.getName() + "," + user.getAge());
        return true;
    }
}
