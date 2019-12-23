/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ClassMethodParamTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-23 - cl- 创建。
 */

package com.zeroten.javales.classobject;

import org.testng.annotations.Test;

public class ClassMethodParamTest {
    private void changePrimitive(int numb){
        System.out.println("传入前：" + numb);
        numb = 20;
        System.out.println("修改后：" + numb);
    }
    private  void changeReference(StringBuilder sb){
        System.out.println("传入：" + sb.toString());
        sb.append("-追加");
        System.out.println("修改后：" + sb.toString());

        sb=new StringBuilder();
        sb.append("新字符串");
    }

    @Test
    public void testModifyMethodParm(){
        int numb=10;
        changePrimitive(numb);
        System.out.println("numb=" + numb);

        StringBuilder sb = new StringBuilder();
        sb.append("字符串");
        changeReference(sb);
        System.out.println("sb=" + sb.toString());
    }
}
