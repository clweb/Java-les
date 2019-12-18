/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： TypeConversionTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-18 - cl- 创建。
 */

package com.zeroten.javales.type;

import org.testng.annotations.Test;

public class TypeConversionTest {
    @Test
    public void test自动类型转换(){
        double d1 = 1F;
        double d2 = 1L;
        short s1 = 1;
        short s2 = 1000;
        System.out.println(d1);//1.0
        System.out.println(d2);//1.0
        System.out.println(s1);//1
        System.out.println(s2);//1000
    }

    @Test
    public void test强制类型转换(){
        short s1 = 1;
        int n1 = s1;

//      int 到 short，精度下降，不能直接转换，报错
//      short s2 = n1;
        short s3 = (short) n1;
        System.out.println(s1);//1
        System.out.println(n1);//1
        System.out.println(s3);//1
        int n2 = 100000;
        short s4 = (short) n2;
// s4 结果是 -31072，强制转换会造成精度丢失，结果不准确
        System.out.println(n2);//100000
        System.out.println(s4);//-31072
    }
}
