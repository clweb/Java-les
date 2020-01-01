/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： UserDao.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.proxy;

import java.util.List;

/**
 * 接口
 */
public interface UserDao {
    boolean save(User user);

    List query();

    boolean delete();
}
