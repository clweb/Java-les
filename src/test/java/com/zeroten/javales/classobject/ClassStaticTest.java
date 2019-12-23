/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ClassStaticTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-23 - cl- 创建。
 */

package com.zeroten.javales.classobject;

public class ClassStaticTest {
    private static final int MAX_COUNT;
    private static int count;
    static {
        System.out.println("执行 static 代码块");
        MAX_COUNT = 6;
    }
    {
        System.out.println("执行初始化代码块");
        this.count = 0;
    }

    public ClassStaticTest() throws Exception{
        count++;
        if(count > MAX_COUNT){
            throw new Exception("只能创建"+MAX_COUNT+"实例对象");
        }
    }

    public static void printCount(){
        System.out.println("总共有"+count+"实例对象");
    }
    public static void main(String[] args){
        try {
            new ClassStaticTest();
            ClassStaticTest obj2=new ClassStaticTest();
            new ClassStaticTest();
            new ClassStaticTest();
            new ClassStaticTest();
            new ClassStaticTest();
//            new ClassStaticTest();
            ClassStaticTest.printCount();
            obj2.printCount();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
