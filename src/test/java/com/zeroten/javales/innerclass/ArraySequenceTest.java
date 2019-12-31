/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ArraySequenceTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ArraySequenceTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.innerclass;

import org.testng.annotations.Test;

public class ArraySequenceTest {
    @Test
    public void testPrint() {
        ArraySequence as = new ArraySequence(5);
        as.add(1);
        as.add(2);
        as.add(3);

        as.add(4);
        as.add(5);
        as.add(6);
        as.print();
//        ArraySequence.SelectorImpl impl = as.new SelectorImpl();
        boolean reverse = false;
        Selector selector;
        if (reverse) {
            System.out.println("倒序");
            selector = as.selectorReverse();
        } else {
            System.out.println("正序");
            selector = as.selector();
        }
        while (!selector.end()) {
            System.out.println(">" + selector.current());
            selector.next();
        }


    }
}
