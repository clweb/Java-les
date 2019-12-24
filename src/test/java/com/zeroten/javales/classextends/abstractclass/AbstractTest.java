/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： AbstractTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： AbstractTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

package com.zeroten.javales.classextends.abstractclass;

import org.testng.annotations.Test;

public class AbstractTest {
    @Test
    public void testPrint(){
        Person p1=new Teacher();
        System.out.println(p1.getDescrition());

        Person p2=new Student();
        System.out.println(p2.getDescrition());
    }
}
