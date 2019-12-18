/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： OperatorTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-18 - cl- 创建。
 */

package com.zeroten.javales.operator;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class OperatorTest {

    @Test
    public void test运算符(){
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1 == obj2);//false
        System.out.println(obj1 != obj2);//true
//      当变量时字符串时, + 表示连接字符串
        String str1 = "hello" + " ";
        str1 += "world";
        System.out.println(str1);//helloworld
//      当变量时数据类型时, + 表示运算
        int n1 = 1;
        int n2 = 1;
        int n3 = n1 + n2;
        System.out.println(n3);//2

        byte b1 = 1;
        byte b2 = 1;
//      两个 byte 相加，返回值的类型是 int，因此下边语句报错
//      byte b3 = b1 + b2;
        short s1 = 1;
        short s2 = 2;
//      两个 short 相加，返回值的类型是 int，因此下边语句报错
//      short s3 = s1 + s2;
        Set<Short> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set);//[1,2]

        set.remove(s1 + 1);
        System.out.println(set);//[1,2]

        set.remove((short) (s1 + 1));
        System.out.println(set);//[1]
    }

    @Test
    public void test算数运算符(){
        System.out.println(3 + 2);//5
        System.out.println(3 - 2);//1
        System.out.println(3 * 2);//6
        System.out.println(3 / 2);//1
        System.out.println(3 % 2);//1
        System.out.println(3 / 2.0);//1.5
        System.out.println("===============================");
        int n1 = 3;
        n1 += 2;
        System.out.println(n1);//5
        n1 = 3;
        n1 -= 2;
        System.out.println(n1);//1
        n1 = 3;
        n1 *= 2;
        System.out.println(n1);//6
        n1 = 3;
        n1 /= 2;
        System.out.println(n1);//1
        n1 = 3;
        n1 %= 2;
        System.out.println(n1);//1
        n1 = 3;
        n1 /= 2.0;
        System.out.println(n1);//1
    }

    @Test
    public void test一元加_减(){
        int n1 = 2;
        int n2 = -n1;
        int n3 = -n2;
        int n4 = +n3;
        System.out.println(n2);//-2
        System.out.println(n3);//2
        System.out.println(n4);//2
        short s1 = 2;
//      一元加会将小类型操作数提升为 int，所以下一句报错
//      short s2 = +s1;
        int s3 = +s1;
        System.out.println(s3);//2
    }

    @Test
    public void test自动递增_递减(){
        int n1 = 5;
        int r1 = 1 + ++n1;
        System.out.println(r1);//7
        System.out.println(n1);//6
        int n2 = 5;
        int r2 = n2++;
        System.out.println(r2);//5
        System.out.println(n2);//6
        int n3 = 5;
        int r3 = --n3;
        System.out.println(r3);//4
        System.out.println(n3);//4
        int n4 = 5;
        int r4 = n4--;
        System.out.println(r4);//5
        System.out.println(n4);//4
    }

    @Test
    public void test关系运算符(){
        System.out.println(5 > 3);//true
        System.out.println(5 > 3.0);//true
        System.out.println(5 < 3);//false
        System.out.println(5 == 3);//false
        System.out.println(5 != 3);//true
    }

    @Test
    public void test逻辑运算符(){
        System.out.println(5 == 5 && 3 == 5);//flase
        System.out.println(5 == 5 && 3 == 3);//true
        System.out.println(5 == 5 || 3 == 5);//true
        System.out.println(5 == 3 || 5 == 5);//true
        System.out.println(!(5 == 3 || 5 == 5));//false
    }
}
