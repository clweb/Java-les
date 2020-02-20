/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： WriterTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-20 - cl- 创建。
 */

package com.zeroten.javales.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriterTest {

    public static void main(String[] args) throws Exception {
        //
        Writer w = new OutputStreamWriter(
                new FileOutputStream(
                        new File("F:\\test.txt")));
        w.write("大厦的那个加拿大\r\n阿斯顿撒旦");
        w.flush();
        w.close();
    }
}
