/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ClassFinalPrefix.java
 * 模块说明：
 * 修改历史:
 * 2019-12-23 - cl- 创建。
 */

package com.zeroten.javales.classobject;

public class ClassFinalPrefix {
    public static final int MAX_INDEX=1000;
    public static int index=0;
    public ClassFinalPrefix(){}
    public ClassFinalPrefix(int index){
        this.index=index;
    }

    public static void main(String[] args) {
        ClassFinalPrefix cf=new ClassFinalPrefix(10);
        System.out.println(cf.MAX_INDEX);
    }
}
