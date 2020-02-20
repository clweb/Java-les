/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： IOTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-18 - cl- 创建。
 */

package com.zeroten.javales.io;

import org.testng.annotations.Test;

import java.io.File;
import java.util.Arrays;

public class IOTest {
    public static void main(String[] args) {
        // 文件再代码中的表现形式
        // 再创建 File 对象是时候,这就是一个对象,没有读取文件,也不会验证
        File f1 = new File("文件的路径(全路径)");
        File f2 = new File("文件的路径", "文件名");

        // 路径
        // 在 windows 当中,\\
        // 在 linux 当中,/
        // File 类创建的对象,可以是路径,也可以是文件

    }

    /**
     * 创建目录
     */
    @Test
    public void testDir1() {
        File f = new File("E://我的java之路//我的前二十五年//第一年");
        File f1 = new File("E://我的java之路//我的前二十五年//第二年");

        // 没有哪个规定,文件一定要有后缀
        System.out.println("文件或目录是否才能在：" + f.exists());// 判断文件或者目录是否存在
        if (!f.exists()) {
//            boolean flag = f.mkdir(); // 创建目录,不会创建不存在的父目录
            boolean flag = f.mkdirs(); // 创建目录,同时创建父目录
            System.out.println(flag);
        }
        if (!f1.exists()) {
//            boolean flag = f1.mkdir(); // 创建目录,不会创建不存在的父目录
            boolean flag = f1.mkdirs(); // 创建目录,同时创建父目录
            System.out.println(flag);
        }
    }

    /**
     * 创建文件
     *
     * @throws Exception
     */
    @Test
    public void testDir2() throws Exception {
        File f = new File("E://我的java之路//我的前二十五年//第一年", "《我和java不得不说的故事》");//目录创建
        if (!f.exists()) {
            boolean flag = f.createNewFile(); // 创建文件
            System.out.println(flag);
        }
    }

    /**
     * 判断是否是文件/目录
     *
     * @throws Exception
     */
    @Test
    public void testDir3() throws Exception {
        File f1 = new File("E://我的java之路//我的前二十五年//第一年");
        File f2 = new File("E://我的java之路//我的前二十五年//第二年",
                "《我和java不得不说的故事》.txt");
        if (!f2.exists()) {
            boolean flag = f2.createNewFile(); // 创建文件
            System.out.println(flag);
        }
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
    }

    /**
     * 文件的其他方法
     *
     * @throws Exception
     */
    @Test
    public void testDir4() throws Exception {
        File f1 = new File("E://我的java之路//我的前二十五年//第一年");
        File f2 = new File("E://我的java之路//我的前二十五年//第一年",
                "《我和java不得不说的故事》.txt");
        // 相对路径/绝对路径
        // 相对路径：从当前位置开始,往后的路径
        // 绝对路径：从根目录开始,往后的全部路径
        // 通常是需要使用在容器中的位置,在 web 中有专门的方法
//        System.out.println(f1.getPath());//相对路径
//        System.out.println(f1.getAbsolutePath());//绝对路径
        System.out.println(f2.length());// 获取的是字节长度,也是不用的
        File f3 = new File("E://我的java之路//我的前二十五年");
        String[] fileList = f3.list();
        System.out.println(Arrays.toString(fileList));
    }

}
