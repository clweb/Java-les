/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ClassStaticPrefix.java
 * 模块说明：
 * 修改历史:
 * 2019-12-23 - cl- 创建。
 */

package com.zeroten.javales.classobject;

public class ClassStaticPrefix {
    public static int count;
    public int index;
    public ClassStaticPrefix(){
        count++;
    }
    public static void setCount(int count){
        ClassStaticPrefix.count=count;
    }

    public static void main(String[] args) {
        ClassStaticPrefix obj1=new ClassStaticPrefix();
        System.out.println(obj1.count);
        ClassStaticPrefix obj2=new ClassStaticPrefix();
        System.out.println(ClassStaticPrefix.count);
    }
}
