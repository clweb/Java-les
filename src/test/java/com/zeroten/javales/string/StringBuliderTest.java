/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： StringBulider.java
 * 模块说明：
 * 修改历史:
 * 2019-12-19 - cl- 创建。
 */

package com.zeroten.javales.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringBuliderTest {
    @Test
    public void testTirmAll(){
        String str="hello";
        Assert.assertEquals(StringBulider.trimAll(" hello"),str);
        Assert.assertEquals(StringBulider.trimAll(" he llo  "),str);
        Assert.assertEquals(StringBulider.trimAll(" hel lo "),str);
        Assert.assertEquals(StringBulider.trimAll("h  el lo"),str);
        Assert.assertEquals(StringBulider.trimAll(" hel   lo"),str);
        Assert.assertEquals(StringBulider.trimAll(" hello          "),str);
        Assert.assertEquals(StringBulider.trimAll(" h e l l o "),str);
    }

    @Test
    public void testReserve(){
        Assert.assertEquals(StringBulider.reverse("121"),"121");
        Assert.assertEquals(StringBulider.reverse("1221"),"1221");
        Assert.assertEquals(StringBulider.reverse("10"),"01");


    }
}
