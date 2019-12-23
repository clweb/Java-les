/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： JavaClass.java
 * 模块说明：
 * 修改历史:
 * 2019-12-22 - cl- 创建。
 */

package com.zeroten.javales.classobject;

public class JavaClass {
    //类变量
    public static String classField;
    //实例变量,域变量
    private String field;
    //实例代码块
    {
        field = "实例变量";
    }
    //静态代码块
    static{
        classField = "类变量";
    }
    //构造方法
    public JavaClass(){ }
    //方法
    public void method(){}
    //内部类
    class InnerClass{}
}
