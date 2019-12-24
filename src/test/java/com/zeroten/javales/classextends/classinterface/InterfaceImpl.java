/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： InterfaceImpl.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

package com.zeroten.javales.classextends.classinterface;

public class InterfaceImpl implements Interface,Interface2{
    @Override
    public void method() {
        System.out.println("我是一个方法");
    }

    @Override
    public void method2() {
        System.out.println("我是另一个方法");
    }
}
