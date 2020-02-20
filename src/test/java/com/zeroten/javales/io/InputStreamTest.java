/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： InputStreamTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-18 - cl- 创建。
 */

package com.zeroten.javales.io;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {

    //以程序作为参照物
    public static void main(String[] args) {
        // 使用流的场景：
        // 	    1.文件的上传下载
        // 	    2.数据的通讯
        // 	    3.特定情况下，对特定文件的处理

        // 数据流 ->
        // 	    输入流：已当前我写的程序为参照，从程序外读取的数据，输入流
        // 	    输出流：已当前我写的程序为参照，往程序外的文件写数据，输出流
        // 持久化：将数据永久保留下来，叫持久化

        // 为什么说字节流是重点：
        // 	 无论将来用什么第三方的Jar包，或者其他中间件，读写数据都离不开流的操作
        // 	 只要是流操作，必然是以字节流为基础
        // 	 首先要获取字节流对象，然后才能进一步操作

        //	一般情况下，第三方的工具都会提供相应的关于流的操作的API，这些API相对都比较高

    }

    @Test
    public void testDemo1() throws Exception {
        // 使用流操作文件
        File f = new File("E://我的java之路//我的前二十五年//第二年",
                "《我和java不得不说的故事》.txt");
        long len1 = f.length();// 读文件大小（单位字节）
        // 这只是一个demo，目的：明白字节流的使用方法
        InputStream input = new FileInputStream(f);
        int len2 = input.available();// 获取可读数据的大小（单位字节）
        // 数组的创建，必然要指定长度，java中默认int
        byte[] bs = new byte[len2];// 用于保存，读取的文件数据
        input.read(bs); // 输入流将直接写入内存地址（太粗暴）
        String str = new String(bs);
        System.out.println(str);
        input.close(); // 关闭流
    }

    @Test
    public void testDemo2() throws Exception {
        // 使用流操作文件
        File f = new File("E://我的java之路//我的前二十五年//第二年",
                "《我和java不得不说的故事》.txt");
        long len1 = f.length();// 读文件大小（单位字节）
        // 这只是一个demo，目的：明白字节流的使用方法
        InputStream input = new FileInputStream(f);
        int len2 = input.available();// 获取可读数据的大小（单位字节）
        // 数组的创建，必然要指定长度，java中默认int
        byte[] bs = new byte[len2];// 用于保存，读取的文件数据
//        input.read(bs); // 输入流将直接写入内存地址（太粗暴）
        // 1.如何暂时保存读到的数据
        byte temp = -1;
        // 2.如何把数据写入数组
        int index = 0;
        //使用循环,依次读
        while ((temp = (byte) input.read()) != -1) {
            bs[index] = temp;
            index++;
        }
        String str = new String(bs);
        System.out.println(str);
        input.close(); // 关闭流
    }
}
