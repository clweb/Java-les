/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： CodeFlowTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-19 - cl- 创建。
 */

package com.zeroten.javales.flow;

import org.testng.annotations.Test;

public class CodeBlockTest {
    @Test
    public void testBlockScope(){
        int n1=1;
        {
//            int n1=11;
            int n2=2;
            System.out.println(n1);//1
            System.out.println(n2);//2
            {
//                int n1=111;
//                int n2=222;
                int n3=3;
                System.out.println(n1);//1
                System.out.println(n2);//2
                System.out.println(n3);//3
            }
        }
        int n2=22;
        System.out.println(n2);//22
        int n3=33;
        System.out.println(n3);//33
    }
}
