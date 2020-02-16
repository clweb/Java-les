/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： ListStudy.java
 * 模块说明：
 * 修改历史:
 * 2020-2-11 - cl- 创建。
 */

package com.zeroten.javales.list;

import java.util.*;

public class ListStudy {
    //list 主要有两种：ArrayList 和 LinkedLIst
    //ArrayList：内部是使用数组来实现的
    //LinkedList:内部使用的是一个双向链来实现
    //创建：无参数构建;有参数构建 1.指定容量大小; 2.复制已存在的List来创建
    //添加：1 头插; 2 尾插; 3中间插入
    //删除：1 头删; 2 尾删; 3中间删除
    //遍历：
    //   1: 使用 for 循环
    //   2: 使用迭代器 Iterator,ListIterator
    //   3: 使用迭代器对 List 进行添加、删除操作
    //   4: 迭代器的使用注意事项：在使用迭代器对列表进行操作时,
    //      原对象不能发生结构性变化(add/remove等),否则迭代器操作会抛异常,通过 modCount 计数来实现
    //      如果发生变化,就需要重新获取迭代器
    //底层实现原理及主要JDK源码：内部存储结构、添加/删除/遍历操作的流程

    //对 List 进行排序: 冒泡、插入、选择
    private static void addNumberToList(List<Integer> list, int count, int number) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(number);
        }
        System.out.println("耗时：" + (System.currentTimeMillis() - start) + "ms");
    }

    private static void studyArrayList() {
        // 创建ArrayList时,如果为指定容量大小,则会创建一个空数组.
        // 第一次调用 add 方法时,将容量扩充为默认容量大小 DEFAULT_CAPACITY
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        int count = 100000;
        list1.add(0, 100);
        list1.add(2, 20);
        list1.set(3, 33);
//        addNumberToList(list1, count, 1);
        System.out.println("list1=" + list1);

        //删除
        list1.remove(1);
        System.out.println("list1=" + list1);
        list1.remove(list1.size() - 1);
        System.out.println("list1=" + list1);

        System.out.print("for循环遍历:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + "|");
        }
        System.out.print("\n迭代器遍历：");
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "|");
        }
        System.out.print("\nforeach循环遍历：");
        for (Integer num : list1) {
            System.out.print(num + "|");
        }
        System.out.println();
        // 如果在创建 ArrayList 时,能预估数据规模,
        // 我们就可以支付那个一个初始容量大小,以减少扩容操作
        List<Integer> list2 = new ArrayList<>(list1);
        addNumberToList(list2, count, 1);
//        for (Integer n : list1) {
//            list2.add(n);
//        }
//        System.out.println("list2=" + list2);
        // 数组是有容量大小限制,当 add 操作时,如果数组已满,就会引发扩容
        // 1. 计算新的容量大小:原来容量的1.5倍
        // 2. 将新的容量大小创建一个新的数组
        // 3. 将旧的数组里的元素全部复制到新创建的数组中
        // 4. 丢弃旧的数组
    }

    private static void listIterator() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator<String> listIterator = list.listIterator();
        System.out.println("迭代器遍历：");
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }

//      [A,B,C]
        System.out.println("hasPrevious=" + listIterator.hasPrevious());
        System.out.println("hasNext=" + listIterator.hasNext());
        System.out.println("previousIndex=" + listIterator.previousIndex());
        System.out.println("nextIndex=" + listIterator.nextIndex());

//        System.out.println(listIterator.previous()); //出错 抛 java.util.NoSuchElementException 异常
        System.out.println(listIterator.next());

        System.out.println("hasPrevious=" + listIterator.hasPrevious());
        System.out.println("hasNext=" + listIterator.hasNext());
        System.out.println("previousIndex=" + listIterator.previousIndex());
        System.out.println("nextIndex=" + listIterator.nextIndex());

        System.out.println(list);
        System.out.println("previousIndex=" + listIterator.previousIndex());
        System.out.println("nextIndex=" + listIterator.nextIndex());

//        System.out.println("previous=" + listIterator.previous());
        listIterator.set("A-Update");
        System.out.println(list);//[A-Update,B,C]
        System.out.println("previousIndex=" + listIterator.previousIndex());
        System.out.println("nextIndex=" + listIterator.nextIndex());
        listIterator.add("A-New");
        System.out.println(list);//[A-Update, A-New, B, C]

        System.out.println("previous=" + listIterator.previous());
        listIterator.set("A-Update2");
        System.out.println(list);//[A-Update, A-Update2, B, C]
        System.out.println("previousIndex=" + listIterator.previousIndex());
        System.out.println("nextIndex=" + listIterator.nextIndex());

        listIterator.remove();
        System.out.println(list);//[A-Update, B, C]

        System.out.println("next=" + listIterator.next());
        listIterator.remove();
        System.out.println(list);//[A-Update, C]

        //迭代器操作元素的时候
        //set 和 remove 方法和迭代器的状态有关，更新或者删除是上一次调用 next 或者previous 方法返回的元素
        //add 只和迭代器的位置有关,在当前迭代器位置之前添加元素


    }

    private static void studyLinkedList() {
        //链表创建的时候不需要指定容量大小,因为它没有大小限制
        List list1 = new LinkedList();
        list1.add("A");
        list1.add("B");
        System.out.println("list1=" + list1);

        List list2 = new LinkedList(list1);
        System.out.println("list2=" + list2);

        System.out.println(list1.get(1));
        //其余操作和 ArrayList 一样
    }

    private static void listQpTime(List<Integer> list) {
        int times = 100000;
        // for 循环遍历
        //对于 LinkedList 每次get(index),都会从头开始查找
        //优化： 如果i > length/2 时,从尾部开始查找
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        System.out.printf("[%s] for 遍历耗时 %dms：\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);

        //Iterator
        start = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.printf("[%s] 迭代器 遍历耗时 %dms：\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);

        //for-each
        start = System.currentTimeMillis();
        for (Integer num : list) {
        }
        System.out.printf("[%s] for-each 遍历耗时 %dms：\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);

        // 在第5位插入 100000 个1
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            list.add(4, 1);
        }
        System.out.printf("[%s] 第5位插入耗时 %dms：\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);

        //在末尾插入 100000 个2
        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            list.add(2);
        }
        System.out.printf("[%s] 末尾插入耗时 %dms：\n", list.getClass().getSimpleName(), System.currentTimeMillis() - start);

    }

    public static void main(String[] args) {
//        studyArrayList();
//        listIterator();
//        studyLinkedList();
        // ArrayList 和 LinkedList 区别
        // ArrayList 长于快速访问,而从列表中间删除/插入元素很慢
        // LinkedList 长于从列表中讲删除/插入元素,但随即访问很慢
        // 随机访问：list.get(index),通过索引来访问

        List<Integer> list = new ArrayList<>();
        fill(list);
        listQpTime(list);

        List<Integer> list2 = new LinkedList<>();
        fill(list2);
        listQpTime(list2);

    }

    private static void fill(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
    }
}
