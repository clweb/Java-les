/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： PracticeTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-19 - cl- 创建。
 */

package com.zeroten.javales.flow;

import org.testng.annotations.Test;

import java.util.Random;

public class PracticeTest {
    @Test
    public void testPractice1(){
//        练习1：还是前边的练习，我们来改写一下。随机生成一个 0 ～ 1000 范围的整数，
//        如果不能被30整除，则打印出数字，如果能被30整除则退出循环。
        while (true){
            int r=new Random().nextInt(1000);
            if(r % 30 == 0){
                System.out.println("随机数"+r+"能被30整除");
                break;
            }else{
                System.out.println("随机数"+r+"不能被30整除");
            }
        }
    }

//       练习2：编写一个方法 int getMaxNumRem7(int n1, int n2) 找出 0 ~ n2 范围内除以
//       n1 余 7 的最大的数，找到则返回该数，如果找不到则返回 -1。
    int getMaxNumRem7(int n1,int n2){
        for (int n = n2; n >= 0;n--){
            if(n%n1==7){
                return n;
            }
        }
        return -1;
    }
    @Test
    public void testPractice2(){
        int num=getMaxNumRem7(10,55);
        System.out.println(num);
    }

    @Test
    public void testPractice3(){
        int total = 0;
        for (int n = 0; n < 100; n++) {
            if (n % 7 != 0) {
                continue;
            }
            total += n;
            System.out.println(n + "能被7整除，累计结果：" + total);
        }
        System.out.println("0 ~ 100范围内能被7整除的数累计相加结果：" + total);
    }
}
