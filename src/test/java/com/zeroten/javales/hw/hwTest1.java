/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： hwTest1.java
 * 模块说明：
 * 修改历史:
 * 2019-12-18 - cl- 创建。
 */

package com.zeroten.javales.hw;

import org.testng.annotations.Test;

public class hwTest1 {
    private boolean numEqual(Integer n1,Integer n2){
        return n1 == n2 || n1.equals(n2)?true:false;
    }

    @Test
    public void test数值判断(){
        boolean b1=numEqual(10,10);
        System.out.println(b1);
    }


}
