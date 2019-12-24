/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： Manager.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

package com.zeroten.javales.classextends;

import java.util.Date;

public class Manager extends Empolyee {
    private Integer bouns;

    public Manager(){
//        super(name:"", hireDate:null, salary:0);
        System.out.println("执行 Manager 的无参构造方法");
    }

    public Manager(String name, Date hireDate, Integer salary) {
        super(name, hireDate, salary);
        System.out.println("执行 Manager 的有参构造方法");
    }

    public Manager(String name, Date hireDate, Integer salary, Integer bouns) {
        super(name, hireDate, salary);
//        setName(name);
//        setHireDate(hireDate);
//        setSalary(salary);
        this.bouns = bouns;
        System.out.println("执行 Manager 的有参构造方法");
    }

    public Integer getBouns() {
        return bouns;
    }

    public void setBouns(Integer bouns) {
        this.bouns = bouns;
    }
    //子类可以覆盖父类的方法，我们称为复写或者覆盖，可以使用 @override 标记
    @Override
    public Integer getSalary() {
        if(bouns == null){
            return super.getSalary();
        }
        return super.getSalary()+getBouns();

    }
}
