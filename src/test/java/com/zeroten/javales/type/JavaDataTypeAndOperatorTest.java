/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： JavaDataTypeAndOperatorTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-18 - cl- 创建。
 */

package com.zeroten.javales.type;

import org.testng.annotations.Test;

public class JavaDataTypeAndOperatorTest {

    @Test
    public void test整数类型(){
        //下边赋值语句超过 short 的最大值 32767,程序在编译时就会报错
//        short s1=32768;
        //数值计算时如果计算结果超长了，程序不会报任何错误，会给一个错误数据
        Integer n1=2*Integer.MAX_VALUE;
        System.out.println("n1的值："+n1);
        long n2=1000L;
        System.out.println("n2的值："+n2);
        int n3=0x0F;
        System.out.println("n3的值:"+n3);
        int n4=010;
        System.out.println("n4的值："+n4);
        int n5=0b1_00_01;
        System.out.println("n5的值:"+n5);
    }

    @Test
    public void test浮点类型(){
        float f1 = 3;
        float f2 = 3L;
        float f3 = 3.14F;
        // 下边赋值语句会报错，没有后缀的小数默认为 double 型，因此赋值给比它范围小的 float 会报错
        // float f4 = 3.14;
        double d1 = 3.14;
        double d2 = 3.14D;
        // F后缀为 float 类型，可以赋值给比它精度高的 double 类型
        double d3 = 3.14F;
        // 2.0 - 1.1 = 0.8999999999999999，而不是期望的 0.9
        System.out.println(2.0 - 1.1);
        // 3 * 0.1 = 0.30000000000000004，而不是期望的 0.3
        System.out.println(3 * 0.1);
        // 2 * 0.1 = 0.2，是期望的 0.2
        System.out.println(2 * 0.1);
        Double d4 = Double.MAX_VALUE * 2;
        System.out.println(d4);
        Double nan = Double.NaN;
        System.out.println(nan == Double.NaN);
        System.out.println(Double.isNaN(nan));
    }
    @Test
    public void test字符类型(){
        char c1 = 'A';
        char c2 = '\u0000';
        char c3 = '\uFFFF';
        char c4 = 65;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
    @Test
    public void test布尔类型(){
        boolean b1 = false;
    // 整型值和布尔值直接不能进行相互转换，所有下列语句会报错
    //     System.out.println(b1 == 1);
    }
}
