/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： AgeCheckTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-19 - cl- 创建。
 */

package com.zeroten.javales.flow;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckTest {
//    题目：给定一个年龄，然后判断该年龄属于儿童、青年、中年还是老年；
//    年龄使用 int 类型，只支持整数。
    @Test
    public void testAgeCheck1(){
        Assert.assertEquals(AgeCheck.getAgeName(6),"儿童");
        Assert.assertEquals(AgeCheck.getAgeName(7),"少年");
        Assert.assertEquals(AgeCheck.getAgeName(25),"青年");
    }
    @Test
    public void testAgeCheck2(){
        Assert.assertEquals(AgeCheck.getAgeName(45),"中年");
        Assert.assertEquals(AgeCheck.getAgeName(60),"老年");
        Assert.assertEquals(AgeCheck.getAgeName(80),"老年");
    }
}
