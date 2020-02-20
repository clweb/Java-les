/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： BufferReaderTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-20 - cl- 创建。
 */

package com.zeroten.javales.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest {

    public static void main(String[] args) throws Exception {
        //缓冲：默认8192/8k
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(
                                new File("F:\\test.txt"))));
        // 字符流开始，缓冲才有意义
        StringBuilder str = new StringBuilder();
        String s = "";
        while ((s = br.readLine()) != null) {
            str.append(s);
        }
        System.out.println(str.toString());
        br.close();
    }
}
