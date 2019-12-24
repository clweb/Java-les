/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： Interface.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

package com.zeroten.javales.classextends.classinterface;

public interface Interface {
    //类
    class InnerClass{}
    //接口
    interface InnerInterface{}
    //常量
    int MAX_NUM=100;
    //方法
    void method();
    //默认方法
    default void println(){
        System.out.println("我是一个默认方法");
    };
    //java8才有的静态方法
    static void print(){
        System.out.println("我是接口 java8 中才有的静态方法");
    }
}
