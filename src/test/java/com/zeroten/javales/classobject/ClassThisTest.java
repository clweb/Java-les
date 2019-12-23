/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ClassThisTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-23 - cl- 创建。
 */

package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

public class ClassThisTest {
    public int index=1;
    public ClassThisTest(){}
    public void println(String name){
        System.out.println(this.index + ".hello," +name);
    }

    public void print(int... numbs){
        if(numbs == null){
            System.out.println("param is null");
            return;
        }
        if(numbs.length == 0){
            System.out.println("param length is zero");
            return;
        }
        System.out.println("打印传入的可变参数");
        for (int num:numbs
             ) {
            System.out.println(num);
        }
    }
    @Test
    public void test1(){
        ClassThisTest obj=new ClassThisTest();
        obj.println("wendy");
    }

    @Test
    public void testPrintParams(){
        print();
        print(1);
        print(1,25,64,3);
    }
}
