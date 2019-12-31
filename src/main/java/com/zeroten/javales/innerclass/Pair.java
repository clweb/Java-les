/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： Pair.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.innerclass;

public class Pair {
    private int minValue;
    private int maxValue;

    public Pair(int min, int max) {
        this.minValue = min;
        this.maxValue = max;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int min) {
        this.minValue = min;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int max) {
        this.maxValue = max;
    }
}
