/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： MapTool.java
 * 模块说明：
 * 修改历史:
 * 2020-2-18 - cl- 创建。
 */

package com.zeroten.javales.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MapTool {

    public static void main(String[] args) {
        // 两个工具类：Arrays, Collections
        Integer[] intArr = {1, 3, 5, 6, 4, 2, 8};
        System.out.println("排序前：" + Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println("排序后：" + Arrays.toString(intArr));

        // 数组和集合的转换
        // 数组 -> 集合
        // asList() 如果参数是一个基本数据类型数组,会将数组整体作为一个元素，
        //          集合里面不能存放基本数据类型
        // asList() 转换后的集合是不能改变结构
        System.out.println("数组 -> 集合");
        List list = Arrays.asList(intArr);
//        List<Integer> list = Arrays.asList(intArr);
        System.out.println("数组大小：" + list.size());
        System.out.println(list);

        // 集合 -> 数组
        System.out.println("集合 -> 数组");
        Object[] arr = list.toArray();
//        Integer[] arr = list.toArray(new Integer[new Integer(list.size())]);
        System.out.println(Arrays.toString(arr));

        List<String> lst = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lst.add("" + i);
        }
//        lst = Collections.nCopies(10, "1");
//        System.out.println(lst);


        List<String> subList = lst.subList(lst.size() - 3, lst.size());
        System.out.println(subList);
        subList.clear();
        System.out.println(subList);
        System.out.println(lst);

        lst.add("10");
        System.out.println(lst);

        lst = Collections.unmodifiableList(lst);
//        lst.add("11");
        System.out.println(lst);


        // 队列：队列/双端队列, LinkedList/ArrayDeque/PriorityQueue
        // 两个应用场景：PriorityQueue - 任务调度; LRU -LinkedHashMap
        // 两个工具类：Arrays/Collections
        
    }
}
