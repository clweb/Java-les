/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： CalcMinMaxTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.innerclass;

import org.testng.annotations.Test;

import java.util.Arrays;

public class CalcMinMaxTest {
    @Test
    public void testCalc() {
        int[] params = {1, 3, 2, 9, 30, 7};
        int[] result = CalcMinMax.calc(params);
        System.out.println(Arrays.toString(result));
        System.out.println("最小值：" + result[0]);
        System.out.println("最大值：" + result[1]);
    }

    @Test
    public void testCalc2() {
        int[] params = {1, 3, 2, 9, 30, 7};
        CalcMinMax.Pair pair = CalcMinMax.calc2(params);
        System.out.println("最小值：" + pair.getMinValue());
        System.out.println("最大值：" + pair.getMaxValue());

//        CalcMin.calc(1,3,5,4,62,1,);
    }

}
