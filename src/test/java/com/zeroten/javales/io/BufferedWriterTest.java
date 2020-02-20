/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： BufferedWriterTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-20 - cl- 创建。
 */

package com.zeroten.javales.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class BufferedWriterTest {

    public static void main(String[] args) throws Exception {
        //	BufferedWriter:
        // 	有缓冲
        // 	可以提高写的效率
        // 	缓冲可以自己指定
        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("F:\\test.txt"))));
        bw.write("金克拉金克拉方法可能难道是，零九年圣诞节放假拉回到了卡夫卡");
        bw.flush();//清空缓冲区
        bw.close();
    }
}
