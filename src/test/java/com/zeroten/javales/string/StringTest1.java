/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： StringTest1.java
 * 模块说明：
 * 修改历史:
 * 2019-12-19 - cl- 创建。
 */

package com.zeroten.javales.string;

import org.testng.annotations.Test;

public class StringTest1 {
    @Test
    public void testJVM原始(){
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 50000; i++) {
            str += i;
        }
        System.out.println(str.length());
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
    }
    @Test
    public void testJVM优化(){
        long start = System.currentTimeMillis();
       StringBuilder str=new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            str.append(i);
        }
        System.out.println(str.length());
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
    }
}
