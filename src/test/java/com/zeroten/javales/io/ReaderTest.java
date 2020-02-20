/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ReaderTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-20 - cl- 创建。
 */

package com.zeroten.javales.io;

import java.io.*;

public class ReaderTest {

    public static void main(String[] args) throws IOException {
        // 字符流
        // InputStreamReader(InputStream in)//参数
        // InputStreamReader(InputStream in,String charsetName)//设字符集
        // 一般常用字符集: GBK/UTF-8/GB2312/ISO-8859-1 --->保证统一
        // 字符串可以指定编码集的编码和解码
        // String s1 = new String(bytes, "charset");
        // String s2 = "".getBytes("charset");

        Reader r = new InputStreamReader(
                new FileInputStream(
                        new File("F:\\test.txt")));
//        char ==int
        // 在泛型当中，基本数据类型的泛型，只能使用包装类
        StringBuilder str = new StringBuilder();

        int c = -1;
        while ((c = r.read()) != -1) {
            str.append(c);
        }
        System.out.println(str.toString());
        r.close();
    }
}
