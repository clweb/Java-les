/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ArraySequence.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.innerclass;

import java.util.Arrays;

public class ArraySequence {
    private Object[] data;
    private int next = 0;

    public ArraySequence(int size) {
        data = new Object[size];
    }


    public void add(Object object) {
        if (next < data.length) {
            data[next++] = object;
        }
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }

    public Selector selector() {
        return new SelectorImpl();
    }

    public Selector selectorReverse() {
        return new SelectorReverseImpl();
    }

    class SelectorImpl implements Selector {
        private int index = 0;

        @Override
        public boolean end() {
            return index >= next;
        }

        @Override
        public Object current() {
            if (index < next) {
                return data[index];
            }
            return null;
        }

        @Override
        public void next() {
            index++;
        }
    }

    class SelectorReverseImpl implements Selector {
        private int index;

        public SelectorReverseImpl() {
            this.index = next - 1;
        }

        @Override
        public boolean end() {
            return index < 0;
        }

        @Override
        public Object current() {
            if (next > -1) {
                return data[index];
            }
            return null;
        }

        @Override
        public void next() {
            if (next > -1) {
                index--;
            }
        }
    }
}
