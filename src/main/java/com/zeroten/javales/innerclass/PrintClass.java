/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： PrintClass.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.innerclass;

public class PrintClass {
    private String name;

    public  PrintClass(String name){
        this.name=name;
        System.out.println("调用了父类构造器name="+this.name);
    }

    public void print(){
        System.out.println("我是一个方法");
    }
}
