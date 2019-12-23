/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ClassAccess.java
 * 模块说明：
 * 修改历史:
 * 2019-12-23 - cl- 创建。
 */

package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

public class ClassAccess {
    public String pub="public公开";
    protected String pro="protected保护";
    String def="default默认";
    private String pri="private私有";

    public String getPub(){
        return pub;
    }
    protected  String getPro(){
        return pro;
    }
    String getDef(){
        return def;
    }
    private String getPri(){
        return pri;
    }
    @Test
    public void testAccess(){
        ClassAccess ca=new ClassAccess();
        System.out.println(ca.pub);
        System.out.println(ca.getPub());

        System.out.println(ca.pro);
        System.out.println(ca.getPro());

        System.out.println(ca.def);
        System.out.println(getDef());

        System.out.println(ca.pri);
        System.out.println(ca.getPri());
    }
}
