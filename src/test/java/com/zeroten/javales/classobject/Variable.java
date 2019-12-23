/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： Variable.java
 * 模块说明：
 * 修改历史:
 * 2019-12-22 - cl- 创建。
 */

package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

public class Variable {
    //类变量 or 静态变量 or 静态域
    public static int count = 0;
    //实例变量
    public int index = 0;
    public void method(){
        //局部变量
        int i = 0;
    }
    public Variable(){}
    public Variable(int count,int index){
        this.count=count;
        this.index=index;
    }
    public static void main(String[] args) {
        Variable v1=new Variable();
        v1.index = 1;
        Variable.count++;
        System.out.println("当前创建的第"+v1.index+"个实例,共"+Variable.count+"个");

        Variable v2=new Variable();
        v2.index = 2;
        v2.count++;
        System.out.println("当前创建的第"+v2.index+"个实例,共"+Variable.count+"个");

        System.out.println("v1看到的count="+v1.count);
        System.out.println("v2看到的count="+v2.count);
        System.out.println("v1看到的index="+v1.index);
        System.out.println("v2看到的index="+v2.index);

        Variable v3=new Variable(3,3);
        System.out.println("当前创建的第"+v3.index+"个实例,共"+v3.count+"个");
    }
    @Test
    public void testVar(){

    }
}
