/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： OutputStreamTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-18 - cl- 创建。
 */

package com.zeroten.javales.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamTest {

    public static void main(String[] args) throws Exception {
        // 使用流操作文件
        File f = new File("E://我的java之路//我的前二十五年//第二年",
                "《我和java不得不说的故事》.txt");

        // 输出流,是覆盖原文件里的内容，不是追加
        String str = "第一章\r\n那是一个风雨交加的夜晚...省略一万字\r\n随便写写";

        OutputStream out = new FileOutputStream(f);
        //第一步，获取字节
        byte[] bytes = str.getBytes();
        for (byte b : bytes) {
            out.write(b);
        }
//        out.write(bytes); //写入
        out.flush(); // 把缓冲区的字节推送到输入流里
        out.close();
    }
}
