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
import java.util.Random;

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

    @Test
    public void testCopy(){
        Integer[] arr1={1,2,3,4,5,6};
        Integer[] arr2={5,6,7,8,9,10};
//      拷⻉数组 arr1 的前 3 个元素
        Integer[] arr11=new Integer[3];
        arr11[0]=arr1[0];
        arr11[1]=arr1[1];
        arr11[2]=arr1[2];
        System.out.println("arr11="+Arrays.toString(arr11));

        Integer[] arr12=Arrays.copyOf(arr1,3);
        System.out.println("arr12="+Arrays.toString(arr12));

        //拷贝arr1后三位到新的数组
        Integer[] arr13=Arrays.copyOfRange(arr1,arr1.length-3,arr1.length);
        System.out.println("arr13="+Arrays.toString(arr13));
//      拷⻉数组 arr1 的第 1 位到第 3 位的元素（不包括第 3 位）
        Integer[] arr14=Arrays.copyOfRange(arr1,0,2);
        System.out.println("arr14="+Arrays.toString(arr14));

//      拷⻉数组 arr2 的后 3 位到 arr1 到后 3 位
        System.arraycopy(arr2,arr2.length-3,arr1,arr1.length-3,3);
        System.out.println("arr1="+Arrays.toString(arr1));

    }
    @Test
    public void testFill(){
//        示例：定义⼀个⼤⼩为 10 的 int 数组，并将数组全部初始化为指定的值 5，打印数组；
//        然后将数组后 3 为赋 值为 3，再次打印数组。
        System.out.println("-----原始填充------");
        Integer[] arr1=new Integer[10];
        for (int i = 0; i <10 ; i++) {
            arr1[i]=5;
        }
        System.out.println("arr1="+Arrays.toString(arr1));
        for (int i = arr1.length-3; i <arr1.length ; i++) {
            arr1[i]=3;
        }
        System.out.println("arr1="+Arrays.toString(arr1));
        System.out.println("------使用方法fill()填充-------");
        Integer[] arr2=new Integer[10];
        Arrays.fill(arr2,5);
        System.out.println("arr2="+Arrays.toString(arr2));
        Arrays.fill(arr2,arr2.length-3,arr2.length,3);
        System.out.println("arr2="+Arrays.toString(arr2));
    }
    @Test
    public void testSort(){
//        示例：定义⼀个⼤⼩为 100 的 int 数组，随机给每⼀位赋值⼀个 0 ~ 100 之间的数值，
//        然后对该数组进⾏排 序并打印排序结果。
        int[] arr=new int[100];
        for (int index = 0; index <arr.length ; index++) {
            arr[index]=new Random().nextInt(100);
        }
        System.out.println("排序前："+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }

    @Test
    public void testDuoWeiShuZu(){
//        示例：定义⼀个⼆维数组，第⼀维表示⽤户，
//        第⼆维表示⽤户的具体信息（1. 编码, 2. 姓名, 3.性别, 4.年 龄）。定义赋值并打印。
        String[][] users=new String[2][];
        users[0]=new String[4];
        users[0][0]="0001";
        users[0][1]="张三";
        users[0][2]="男";
        users[0][3]="25";

        users[1]=new String[4];
        users[1][0]="0002";
        users[1][1]="莉莉";
        users[1][2]="女";
        users[1][3]="22";
        System.out.println("for循环");
        for (int index = 0; index <users.length ; index++) {
            System.out.println(Arrays.toString(users[index]));
        }
        System.out.println("foreach循环");
        for (String[] val:users
             ) {
            System.out.println(Arrays.toString(val));
        }
//        System.out.println(users.toString());
    }

    public int[] twoSum(int[] nums,int target){
        int times=0;
        for (int index = 0; index < nums.length; index++) {
            for (int twoindex = index+1; twoindex <nums.length ; twoindex++) {
                times++;
                if (nums[index] + nums[twoindex] == target) {
                    System.out.println("循环"+times+"次");
                    return new int[]{index,twoindex};
                }
            }
        }
        return null;
    }
    public int[] twoSum2(int[] nums,int target){
        System.out.println("传入数组："+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("排序数组："+Arrays.toString(nums));
        int times=0;
        for (int index = 0; index < nums.length ; index++) {
            if(nums[index] >= target){
                return null;
            }
            for (int twoindex = index+1; twoindex < nums.length ; twoindex++) {
                times++;
                if(nums[twoindex] > target){
                    System.out.println("第一个数("+index+")"+nums[index]+"已经大于"+target+",退出循环");
                    break;
                }
                if (nums[index] + nums[twoindex] == target) {
                    System.out.println("循环"+times+"次");
                    return new int[]{index,twoindex};
                }
            }
        }
        return null;
    }

    @Test
    public void testTwoSum(){
        int[] intArr={22,7,11,15,8,9,6,4};
        int target=12;
        System.out.println(Arrays.toString(twoSum(intArr,target)));
        System.out.println("-------------------------");
        System.out.println(Arrays.toString(twoSum2(intArr,target)));
    }
}
