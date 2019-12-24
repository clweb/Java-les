/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： InterfaceTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

package com.zeroten.javales.classextends.classinterface;

import org.testng.annotations.Test;

public class InterfaceTest {
    @Test
    public void test1(){
        InterfaceImpl i1=new InterfaceImpl();
        i1.method();
        i1.method2();
        i1.println();
        System.out.println(i1 instanceof Interface);
        System.out.println(i1 instanceof Interface2);

        System.out.println("实现类访问："+InterfaceImpl.MAX_NUM);
        System.out.println("接口访问："+Interface.MAX_NUM);
        System.out.println("实例对象访问："+i1.MAX_NUM);

        Interface.print();
//        InterfaceImpl.print();
//        i1.print();
    }
}
