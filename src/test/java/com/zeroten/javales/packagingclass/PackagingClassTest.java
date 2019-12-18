/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： PackagingClassTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-18 - cl- 创建。
 */

package com.zeroten.javales.packagingclass;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PackagingClassTest {
    @Test
    public void test包装类对象(){
//        System.out.println(Integer.hashCode());
//        System.out.println(Integer.getInteger());
//        System.out.println(Integer.max());
//        System.out.println(Integer.min());
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    @Test
    public void test定义泛型(){
        List<Integer> list1 = new ArrayList<Integer>();
        // 基本数据类型不能用于定义泛型，所以下边语句报错
        // List<int> list2 = new ArrayList<>();
    }

    @Test
    public void test序列化(){
//        public final class Integer extends Number implements Comparable<Integer>{
//
//        }
//        public abstract class Number implements Serializable{
//
//        }
    }
    @Test
    public void test类型转换(){
        int n1 = Integer.parseInt("100");
        System.out.println(n1);//100

        int n2 = new Integer(100).intValue();
        System.out.println(n2);//100

        boolean b1 = Boolean.valueOf("true");
        System.out.println(b1);//true

        boolean b2 = Boolean.valueOf("tRue");
        System.out.println(b2);//true
    }

    //   Byte：全部缓存，缓存范围 -128~127
//Short：缓存范围 -128~127
//Integer：缓存范围 -128~127
//Long：缓存范围 -128~127
//Float/Double：未缓存
//Character：缓存范围 0~127
//Boolean：缓存了 true/false 实例，Boolean.TRUE/Boolean.FALSE
    @Test
    public void test包装类缓存(){
        Integer num1=127;
        Integer num2=127;
        System.out.println("num1==num2:  "+(num1==num2));//true

        Integer num3=128;
        Integer num4=128;
        System.out.println("num3==num4:  "+(num3==num4));//false

        Integer num5=127;
        Integer num6=new Integer(127);
        System.out.println("num5==num6:  "+(num5==num6));//false

        int num7=127;
        Integer num8=127;
        System.out.println("num7==num8:  "+(num7==num8));//true

        int num9=128;
        Integer num10=128;
        System.out.println("num9==num10:  "+(num9==num10));//false

        Double d1=127D;
        Double d2=127D;
        System.out.println("d1==d2:  "+(d1==d2));//false

        Double d3=128D;
        Double d4=128D;
        System.out.println("d3==d4:  "+(d3==d4));//false

        System.out.println("2*0.1==0.2:  "+(2*0.1==0.2));//true
        System.out.println("3*0.1==0.3:  "+(3*0.1==0.3));//false

    }
}
