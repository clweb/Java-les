/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ClassMethodOverLoading.java
 * 模块说明：
 * 修改历史:
 * 2019-12-23 - cl- 创建。
 */

package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

public class ClassMethodOverLoading {
    public void println(){}
    public void println(int numb){}
    public void println(String str){}
    public void println(int numb1,int numb2){}

    @Test
    public void testOverLoading(){
        println();
        println(1);
        println("str");
        println(4,5);
    }
}

