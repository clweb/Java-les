/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： VariableTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-18 - cl- 创建。
 */

package com.zeroten.javales.typeandoperator.operator.variable;

import org.testng.annotations.Test;

public class VariableTest {
    @Test
    public void test变量(){
        int n1;
//      n1 在使用前（打印）未进行初始化，下边语句报错
//      System.out.println(n1);
        int n2 = 200;
        System.out.println(n2);
        int n3;
        n3 = 300;
        System.out.println(n3);
    }
    @Test
    public void test变量规则(){
//      字母包括 'A' ~ 'Z'、'a' ~ 'z'、'_'、'$' 或在某种语言中代表字母的任何 Unicode 字符，是作为参数调用 Character.isJavaIdentifierStart( int ) 方法时返回 true 的字符。
//      数字包括 '0' ~ '9' 和在某种语言中代表数字的任何 Unicode 字符。
//      字母或数字是作为参数调用 Character.isJavaIdentifierPart( int ) 方法时返回 true 的字符。
        System.out.println(Character.isJavaIdentifierStart('A'));
        System.out.println(Character.isJavaIdentifierStart('a'));
        System.out.println(Character.isJavaIdentifierStart('$'));
        System.out.println(Character.isJavaIdentifierStart('_'));
        System.out.println(Character.isJavaIdentifierStart('2'));

        System.out.println(Character.isJavaIdentifierPart('A'));
        System.out.println(Character.isJavaIdentifierPart('a'));
        System.out.println(Character.isJavaIdentifierPart('$'));
        System.out.println(Character.isJavaIdentifierPart('_'));
        System.out.println(Character.isJavaIdentifierPart('2'));
    }
    @Test
    public void test常量(){
//        在 Java 中，使用关键字 final 指示常量，表示这个变量只能被赋值一次。
//        一旦被赋值就不能够再被修改了。常量名一般使用全大写。
        final int MAX_AGE=200;
        System.out.println(MAX_AGE);
    }
}
