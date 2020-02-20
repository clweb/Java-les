/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： DataStreamTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-20 - cl- 创建。
 */

package com.zeroten.javales.io;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataStreamTest {

    public static void main(String[] args) throws Exception {
        // 	读写数据
        // 	字符串：长度是固定的
        // 	读写顺序不能乱，读写顺序要一致
        // 	类型要对应
        // 	不是序列化
        File f = new File("F:\\person.org");
        if (!f.exists()) {
            f.createNewFile();
        }
        // 写入数据
       /*
        DataOutputStream out = new DataOutputStream(
                new FileOutputStream(f));
        out.writeInt(1);
        out.writeUTF("ybb");
        out.writeFloat(2.1F);
        out.writeDouble(5000.20);
        out.flush();
        out.close();
        */
        // 读取数据
        DataInputStream in = new DataInputStream(
                new FileInputStream(f));
        System.out.println(in.readInt());
        System.out.println(in.readUTF());
        System.out.println(in.readFloat());
        System.out.println(in.readDouble());
        in.close();
    }
}
