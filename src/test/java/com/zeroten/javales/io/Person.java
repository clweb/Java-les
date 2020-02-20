/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： Person.java
 * 模块说明：
 * 修改历史:
 * 2020-2-20 - cl- 创建。
 */

package com.zeroten.javales.io;

import java.io.Serializable;

public class Person implements Serializable {

    /**
     * 保证数据一致性
     */
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Integer age;
    private Car car;

    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Car getCar() {
        return car;
    }

    public Person setCar(Car car) {
        this.car = car;
        return this;
    }
}
