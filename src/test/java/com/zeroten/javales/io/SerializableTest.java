/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： SerializableTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-20 - cl- 创建。
 */

package com.zeroten.javales.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

    public static void main(String[] args) throws Exception {
        //	JDK内置序列化和反序列化
        // 	序列化：将对象转化为二进制的字节序列
        // 	序列化的第一步，是必须实现 Serializable 这个接口
        // 	Serializable 接口是一个用于标识的接口
        // 	ObjectInputStream/ObjectOutputStream:是序列化和反序列化的两个实现类
        // 	主要方法是：
        // 1)	readObject()
        // 2)	writerObject()
        //  如果不加序列化接口，会抛异常
        //	版本号不一致，无法反序列化
        // 	在序列化的时候，包括类的成员属性，及其子类，都必须是可序列化类，
        // 	但是如果该类的父类，实现了可序列化接口，那么一样可以序列化
        Person p = new Person()
                .setId(1)
                .setName("ybb")
                .setAge(25)
                .setCar(new Car());
        // 直接把内存数据序列化到文件里
        File file = new File("F:\\person.json");
        if (!file.exists()) {
            file.createNewFile();
        }

        // 序列化：把对象序列化二进制
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(file));
        out.writeObject(p);
        out.flush();
        out.close();
        // 反序列化：把二进制，反序列化成对象
        /*ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(file));
        Object obj = in.readObject();
        if (obj instanceof Person) {
            Person p2 = (Person) obj;
            System.out.println(p2);
        }
        in.close();*/
    }
}
