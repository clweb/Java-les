/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： CopeTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： CopeTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

package com.zeroten.javales.classextends;

import org.testng.annotations.Test;

public class CopeTest {
    @Test
    public void testCopy(){
        Empolyee e1=new Empolyee();
        try {
            Empolyee e2=e1.clone();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
