/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： CreateObjectTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-23 - cl- 创建。
 */

package com.zeroten.javales.classobject;

public class CreateObjectTest {
    static String className = "创建对象测试";
    static String staticFieldNotSet;
    final static String finalStaticField;

    int index = -1;

    {
        System.out.println("执行第一个初始化块：" + index);
        index = 1;
        System.out.println("  赋值后：" + index);
    }

    static {
        System.out.println("执行第一个静态初始化块");
        finalStaticField = "final 修饰的静态域必须进行显式的赋值初始化";
    }

    {
        System.out.println("执行第二个初始化块：" + index);
        index = 2;
        System.out.println("  赋值后：" + index);
    }

    static {
        System.out.println("执行第二个静态初始化块");
    }


    public CreateObjectTest() {
        System.out.println("执行构造器");

        this.index = 3;
        className = "创建对象测试 - 构造器赋值";
    }

    public static void main(String[] args) {
        new CreateObjectTest();
    }

    {
        System.out.println("执行第三个初始化块");
    }

    static {
        System.out.println("执行第三个静态初始化块");
    }

    {
        System.out.println("执行第四个初始化块");
    }

    static {
        System.out.println("执行第四个静态初始化块");
    }
}
