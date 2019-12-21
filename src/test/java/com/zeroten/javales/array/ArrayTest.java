/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ArrayTest.java
 * 模块说明：
 * 修改历史:
 * 2019-12-21 - cl- 创建。
 */

package com.zeroten.javales.array;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayTest {
    @Test
    public void testArrayDeclare(){
        int[] arr1;
        String[] arr2;
        int arr3[];
        String arr4[];
    }
    @Test
    public void testFuZhi(){
        int[] arr1=new int[3];
        System.out.println(Arrays.toString(arr1));

        boolean[] arr2=new boolean[3];
        System.out.println(Arrays.toString(arr2));

        String[] arr3=new String[3];
        System.out.println(Arrays.toString(arr3));

        Object[] arr4=new Object[5];
        System.out.println(Arrays.toString(arr4));

        int[] arr5;
        System.out.println();
        arr5=new int[2];
        System.out.println(Arrays.toString(arr5));

//        int[] arr6=new int[]{1,2,3};
        int[] arr6={1,2,3};
        System.out.println(Arrays.toString(arr6));

//        String[] arr7=new String[]{"1","2","3"};
        String[] arr7={"字符串1",null,"3",""};
        System.out.println(Arrays.toString(arr7));

    }

    @Test
    public void testBianLi(){
//        示例：分别使⽤上述三种⽅式遍历数组 Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] arr={1,2,3,4,5};
        System.out.println("1.for循环适应数组下标");
        for (int index = 0; index < arr.length; index++) {
//            System.out.println("下标"+index+",存放的值是"+arr[index]);
            System.out.println(String.format("下标：%d,存放的值是：%d",index,arr[index]));
        }
        System.out.println("2.for each循环");
        int index=1;
        for (int numb:arr) {
            System.out.println(String.format("第%d次取到的值:%d",index,numb));
            index++;
//            System.out.println("值："+numb);
        }
        System.out.println("java8新增的Lambda表达式");
        Arrays.asList(arr).forEach(val->{
            System.out.println("值是"+val);
            if(val % 2 == 0){
                System.out.println("  它是一个偶数");
            }else{
                System.out.println("  它是一个奇数");
            }
        });
    }
}
