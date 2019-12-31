/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： Outer.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.innerclass;

public class Outer {
    public int num = 1;

    interface Inter {
        void show();
    }

    class Inner {
        public int num = 2;

        public void show() {
            int num = 3;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }


    class create implements Inter {
        String str = "Hello World!";

        @Override
        public void show() {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();

        new Outer().new create().show();
    }
}
