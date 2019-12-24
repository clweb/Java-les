/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： Empolyee.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

package com.zeroten.javales.classextends;

import java.util.Date;

public class Empolyee implements Cloneable{
    private String name;
    private Date HireDate;
    private Integer salary;

    public Empolyee(){
        System.out.println("执行 Empoyee 的无参构造方法");
    }

    public Empolyee(String name, Date hireDate, Integer salary) {
        System.out.println("执行 Empoyee 的有参构造方法");
        this.name = name;
        HireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate(Date hireDate) {
        HireDate = hireDate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();
        str.append("员工：");
        str.append(getName());
        str.append(",入职时间：");
        str.append(getHireDate());
        str.append(",薪水标准：");
        str.append(getSalary());
        return str.toString();
    }
    public Empolyee clone() throws CloneNotSupportedException{
        return (Empolyee) super.clone();
    }
}
