/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： CalcMinMax.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.innerclass;

public class CalcMinMax {
    public static int[] calc(int... numbs) {
        Integer min = null;
        Integer max = null;
        for (int numb : numbs) {
            if (min == null || min > numb) {
                min = numb;
            }
            if (max == null || max < numb) {
                max = numb;
            }
        }
        return new int[]{min, max};
    }

    public static Pair calc2(int... numbs) {
        Integer min = null;
        Integer max = null;
        for (int numb : numbs) {
            if (min == null || min > numb) {
                min = numb;
            }
            if (max == null || max < numb) {
                max = numb;
            }
        }
        return new Pair(min, max);
    }

    public static class Pair {
        private int minValue;
        private int maxValue;

        public Pair(int minValue, int maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public int getMinValue() {
            return minValue;
        }

        public void setMinValue(int minValue) {
            this.minValue = minValue;
        }

        public int getMaxValue() {
            return maxValue;
        }

        public void setMaxValue(int maxValue) {
            this.maxValue = maxValue;
        }
    }
}
