/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： PkgTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-23 - cl- 创建。
 */

package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

import java.util.Date;

public class PkgTest {
    @Test
    public void testPkg(){
        java.util.Date date=new java.util.Date();
        System.out.println(date);

        Date date1=new Date();
        System.out.println(date1);
    }
}
