/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ClassConstrutor.java
 * 模块说明：
 * 修改历史:
 * 2019-12-22 - cl- 创建。
 */

package com.zeroten.javales.classobject;

public class ClassConstrutor {
    private int n1;
    private int n2;
    public ClassConstrutor(){}
    public ClassConstrutor(int n1){
        this();
        this.n1=n1;
    }
    public ClassConstrutor(int n1,int n2){
        this(n1);
        this.n2=n2;
    }
}
