/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： DoubleInit.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.innerclass;

import java.util.ArrayList;
import java.util.List;

public class DoubleInit {
    public static void main(String[] args){
        List<Integer> numbs=new ArrayList();
        numbs.add(1);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(5);
        System.out.println("numbs="+numbs);
        class ArrayListNew extends ArrayList{
            private String name="";
            {
                //初始化代码块
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        }
        List<Integer> numbs2=new ArrayListNew();
//        numbs2.add(1);
//        numbs2.add(2);
//        numbs2.add(3);
//        numbs2.add(4);
//        numbs2.add(5);
        System.out.println("numbs2="+numbs2);

       List<Integer> numbs3= new ArrayList(){
            {
                //初始化代码块
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        System.out.println("numbs3="+numbs3);
    }
}
