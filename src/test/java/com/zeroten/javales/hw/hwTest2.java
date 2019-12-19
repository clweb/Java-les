/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： hwTest2.java
 * 模块说明：
 * 修改历史:
 * 2019-12-19 - cl- 创建。
 */

package com.zeroten.javales.hw;

import org.testng.annotations.Test;

public class hwTest2 {
//      吸血鬼数字时指位数为偶数的数字，可以由一对数字相乘得到，而且这对数字个包含乘积的一半数字，
//      其中从最初的数字中选取的数字可以任意排序。例如，下边的数字都是“吸血鬼”数字：
//      1260=21*60
//      1827=21*87
//      2187=27*81
    public static int a(int i) {
        return i/1000;
}
    public static int b(int i) {
        return (i%1000)/100;
    }
    public static int c(int i) {
        return ((i%1000)%100)/10;
    }
    public static int d(int i) {
        return i%10;
    }
    public static int com(int i, int j) {
        return (i * 10) + j;
    }
    public static void productTest (int i, int m, int n) {
//        num++;
        if(m * n == i) System.out.println(i + " = " + m + " * " + n);
    }
    @Test
    public void testVampireNum(){
        for(int i = 1001; i < 9999; i++) {
            int a=a(i);
            int b=b(i);
            int c=c(i);
            int d=d(i);
            productTest(i, com(a, b), com(c, d));
            productTest(i, com(a, b), com(d, c));
            productTest(i, com(a, c), com(b, d));
            productTest(i, com(a, c), com(d, b));
            productTest(i, com(a, d), com(b, c));
            productTest(i, com(a, d), com(c, b));
            productTest(i, com(b, a), com(c, d));
            productTest(i, com(b, a), com(d, c));
            productTest(i, com(b, c), com(d, a));
            productTest(i, com(b, d), com(c, a));
            productTest(i, com(c, a), com(d, b));
            productTest(i, com(c, b), com(d, a));
        }

    }
//  回文数：判断一个整数是否是回文数.回文数是指正序(从左到右)和倒序(从右到左)读都是一样的整数。
//  编写方法boolean isPalindrome(int x)
    boolean isPalindrome(int x){
        if(x<0) return false;
        if(x==0) return true;
        int i=0;
        while (i<x){
            i*=10;
            i+=x%10;
            if(i==0) return false;
            x/=10;
        }
        if(i==x){
            return true;
        }else{
            if(i/10==x) return true;
            else return false;
        }
    }
   @Test
    public void testPalindrome(){
        int num=122;
        boolean flag=isPalindrome(num);
        if(flag){
            System.out.println("输入："+num);
            System.out.println("输出："+flag);
        }else{
            System.out.println("输入："+num);
            System.out.println("输出："+flag);
        }

   }

   //
}
