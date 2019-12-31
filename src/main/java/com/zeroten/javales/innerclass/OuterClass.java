/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： OuterClass.java
 * 模块说明：
 * 修改历史:
 * 2019-12-24 - cl- 创建。
 */

package com.zeroten.javales.innerclass;

public class OuterClass {

    private Integer index;
    private String name;

    public OuterClass(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    //内部类：定义在其他类中的类，称为内部类
    public  class InnerClass{
        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        public class innerClass2{
            public class innerClass3{
            }
        }
        public  void printInfo(){
            //使用局部内部类打印
            String name="我是局部内部类";
            class PrintClass1{
                void print(){
                    System.out.println("使用局部内部类打印：");
                    StringBuilder tmp=new StringBuilder();
                    tmp.append("外围类index=");
                    tmp.append(index);
                    tmp.append(",外围类name=");
                    tmp.append(OuterClass.this.name);
                    tmp.append(",内部类name=");
                    tmp.append(InnerClass.this.name);
                    tmp.append(",局部内部类name=");
                    tmp.append(name);
                    System.out.println(tmp.toString());
                }
            }
            new PrintClass1().print();
//            class PrintInterfaceImp implements PrintInterface{
//                @Override
//                public void print() {
//
//                }
//            }
//            new PrintInterfaceImp().print();
            //使用匿名内部类实现打印--实现接口
            new PrintInterface(){
                @Override
                public void print() {
                    System.out.println("使用匿名内部类(接口实现)打印：");
                    StringBuilder tmp=new StringBuilder();
                    tmp.append("外围类index=");
                    tmp.append(index);
                    tmp.append(",外围类name=");
                    tmp.append(OuterClass.this.name);
                    tmp.append(",内部类name=");
                    tmp.append(InnerClass.this.name);
                    tmp.append(",局部内部类name=");
                    tmp.append(name);
                    System.out.println(tmp.toString());
                }
            }.print();


            //使用匿名内部类实现打印--实现抽象类
            new PrintAbstract(){
                @Override
                void print() {
                    System.out.println("使用匿名内部类(抽象类实现)打印：");
                    StringBuilder tmp=new StringBuilder();
                    tmp.append("外围类index=");
                    tmp.append(index);
                    tmp.append(",外围类name=");
                    tmp.append(OuterClass.this.name);
                    tmp.append(",内部类name=");
                    tmp.append(InnerClass.this.name);
                    tmp.append(",局部内部类name=");
                    tmp.append(name);
                    System.out.println(tmp.toString());
                }
            }.print();
            //使用匿名内部类实现打印--类
            new PrintClass("类名"){
                @Override
                public void print(){
                    System.out.println("使用匿名内部类(类实现)打印：");
                    StringBuilder tmp=new StringBuilder();
                    tmp.append("外围类index=");
                    tmp.append(index);
                    tmp.append(",外围类name=");
                    tmp.append(OuterClass.this.name);
                    tmp.append(",内部类name=");
                    tmp.append(InnerClass.this.name);
                    tmp.append(",局部内部类name=");
                    tmp.append(name);
                    System.out.println(tmp.toString());
                }
            }.print();
        }
    }
    public static void main(String[] args){
        OuterClass outerClass=new OuterClass(1,"我是外部类");
//      使用OuterClass.innerClass访问内部类
        OuterClass.InnerClass innerClass=outerClass.new InnerClass("我是内部类");
        innerClass.printInfo();
    }
}
