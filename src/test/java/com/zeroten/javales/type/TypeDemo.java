/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： TypeDemo.java
 * 模块说明：
 * 修改历史:
 * 2019-12-18 - cl- 创建。
 */

package com.zeroten.javales.type;

import org.testng.annotations.Test;

public class TypeDemo {
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
        System.out.println("num1==num2:  "+(num1==num2));

        Integer num3=128;
        Integer num4=128;
        System.out.println("num3==num4:  "+(num3==num4));

        Integer num5=127;
        Integer num6=new Integer(127);
        System.out.println("num5==num6:  "+(num5==num6));

        int num7=127;
        Integer num8=127;
        System.out.println("num7==num8:  "+(num7==num8));

        int num9=128;
        Integer num10=128;
        System.out.println("num9==num10:  "+(num9==num10));

        Double d1=127D;
        Double d2=127D;
        System.out.println("d1==d2:  "+(d1==d2));

        Double d3=128D;
        Double d4=128D;
        System.out.println("d3==d4:  "+(d3==d4));

        System.out.println("2*0.1==0.2:  "+(2*0.1==0.2));
        System.out.println("3*0.1==0.3:  "+(3*0.1==0.3));

    }
}
