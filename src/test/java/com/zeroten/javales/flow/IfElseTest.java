/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： IfElseTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-19 - cl- 创建。
 */

package com.zeroten.javales.flow;

import org.testng.annotations.Test;

import java.util.Random;

public class IfElseTest {
    @Test
    public void testIfElse(){
//        年龄范围
//0 ~ 6岁
//儿童
//7 ~ 17岁
//少年
//18 ~ 40岁
//青年
//41 ~ 59岁
//中年
//60及以上
//老年
        int age=10;
        if(age<7){
            System.out.println(age+"岁,属于儿童");
        }else if(age<18){
            System.out.println(age+"岁,属于少年");
        }else if(age<41){
            System.out.println(age+"岁,属于青年");
        }else if(age<60){
            System.out.println(age+"岁,属于中年");
        }else {
            System.out.println(age+"岁，属于老年");
        }
    }

    @Test
    public void testWhile(){
//        练习：随机生成一个 0 ～ 1000 范围的整数，如果不能被30整除，则打印出数字
//        ，如果能被30整除则退出循环。生成 0 ~ 1000 范围的整数使用语句
//        int r = new Random().nextInt(1000)。
        boolean isContinue=true;
        int count=0;
        while (isContinue){
            int r=new Random().nextInt(1000);
            count++;
            if(r%30==0){
                System.out.println("随机数"+r+"能被30整除,退出");
                isContinue=false;
            }else{
                System.out.println("随机数"+r+"不能被30整除,继续");
            }
        }
        System.out.println("共产生"+count+"个随机数不能被30整除");
    }

    @Test
    public void testDoWhile(){
        boolean isContinue=true;
        int count=0;
        do{
            count++;
            int r=new Random().nextInt(1000);
            if(r % 30 == 0){
                System.out.println("随机数"+r+"能被30整除,退出");
                isContinue=false;
            }else {
                System.out.println("随机数"+r+"不能被30整除,继续");
            }
        }while (isContinue);
        System.out.println("共产生"+(count-1)+"个随机数不能被30整除");
    }

    @Test
    public void testFor(){
//        练习：打印 0 ~ 100 范围内的单数并计算范围内单数的总个数。
        int count=0;
        for (int i=0;i<=100;i++){
            if(i%2!=0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("0~100之间的单数总个数："+count);
    }

    @Test
    public void testSwitch(){
// |数字指令    |执行命令
//|----------|--------|
//|1  |扫地
//|2  |开灯
//|3  |关灯
//|4  |播放音乐
//|5  |关闭音乐
//|其他数字  |不能识别的指令
        int cmdN=6;
        switch (cmdN){
            case 1:
                System.out.println("扫地");
                break;
            case 2:
                System.out.println("开灯");
                break;
            case 3:
                System.out.println("关灯");
                break;
            case 4:
                System.out.println("播放音乐");
                break;
            case 5:
                System.out.println("关闭音乐");
                break;
            default:
                System.out.println("不能识别的指令");
        }
    }
}
