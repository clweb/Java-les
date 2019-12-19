/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： AgeCheck.java
 * 模块说明：
 * 修改历史:
 * 2019-12-19 - cl- 创建。
 */

package com.zeroten.javales.flow;

public class AgeCheck {
    public static String getAgeName(int age){
        if(age < 7){
            return "儿童";
        }
        if(age < 18){
            return "少年";
        }
        if(age < 41){
            return "青年";
        }
        if(age<60){
            return "中年";
        }
        return "老年";
    }
}
