/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： MasterManager.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

package com.zeroten.javales.classextends;

import java.util.Date;

public class MasterManager extends Manager {
    @Override
    public String getName(){
        return "["+super.getName()+"]";
    }

    public MasterManager(){
        System.out.println("执行了 asterManager 的无参构造方法");
    }

    public MasterManager(String name, Date hireDate, Integer salary) {
        super(name, hireDate, salary);
        System.out.println("执行了 MasterManager 的有参构造方法");
    }

    public MasterManager(String name, Date hireDate, Integer salary, Integer bouns) {
        super(name, hireDate, salary, bouns);
        System.out.println("执行了 MasterManager 的有参构造方法");
    }
}
