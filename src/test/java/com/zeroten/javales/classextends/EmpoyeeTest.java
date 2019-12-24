/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： EmpoyeeTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

package com.zeroten.javales.classextends;

import org.testng.annotations.Test;

import java.util.Date;

public class EmpoyeeTest {
    @Test
    public void testToString(){
        Empolyee yg1=new Empolyee();
        yg1.setName("员工一");
        yg1.setHireDate(new Date());
        yg1.setSalary(100);
        System.out.println(yg1.toString());

        Manager jl1=new Manager();
        jl1.setName("经理一");
        jl1.setHireDate(new Date());
        jl1.setSalary(120);
        jl1.setBouns(30);
        System.out.println(jl1.toString());
    }

    @Test
    public void testToString1(){
        Empolyee empolyee=new Empolyee("员工一",new Date(),100);
        System.out.println(empolyee.toString());

        Manager manager=new Manager("经理一",new Date(),120,30);
        System.out.println(manager.toString());
    }

    @Test
    public void testDuoTai(){
        Empolyee empolyee=new Empolyee("员工一",new Date(),100);
        Manager manager=new Manager("经理一",new Date(),120,30);
        MasterManager mManager=new MasterManager("总经理一",new Date(),150,50);

        Empolyee yg=empolyee;
        System.out.println(yg.toString());

        yg=manager;
        System.out.println(yg.toString());

        yg=mManager;
        System.out.println(yg.toString());
    }

    @Test
    public void testDuoTai1(){
        Empolyee empolyee=new Empolyee("员工二",new Date(),100);
        Manager manager=new Manager("经理二",new Date(),120,30);
        MasterManager mManager=new MasterManager("总经理一",new Date(),150,50);

        Empolyee yg=empolyee;
        System.out.println(yg.toString());

        yg=manager;
        System.out.println(yg.toString());
//      强制类型转换
        Manager m1=(Manager) yg;
        System.out.println("我的奖金是："+m1.getBouns());

        yg=mManager;
        System.out.println(yg.toString());
//      强制类型转换
        MasterManager mm1=(MasterManager) yg;
        System.out.println("我的奖金是："+ mm1.getBouns());

//      使用 instanceof 类型检测
        System.out.println(yg instanceof Empolyee);
        System.out.println(yg instanceof  Manager);
        System.out.println(yg instanceof MasterManager);

        Object object=new Date();
        if(object instanceof Manager){
            Manager m2=(Manager) object;
        }else{
            System.out.println("object 不是一个 Manager");
        }
    }

    @Test
    public void testObjectMethod(){
        Empolyee empolyee=new Empolyee();
        System.out.println(empolyee.getClass().getName());
        System.out.println(empolyee.getClass().getSimpleName());
        System.out.println(empolyee.hashCode());
        System.out.println(empolyee.toString());

        int[] arr=new int[0];
        System.out.println(arr.getClass().getName());
        System.out.println(arr.getClass().getSimpleName());
        System.out.println(arr.hashCode());
        System.out.println(arr.toString());

        Empolyee empolyee1=new Manager();
        System.out.println(empolyee1.getClass().getName());
        System.out.println(empolyee1.getClass().getSimpleName());
        System.out.println(empolyee1.hashCode());
        System.out.println(empolyee1.toString());
    }
}
