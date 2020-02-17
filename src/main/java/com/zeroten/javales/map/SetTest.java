/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： SetTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-17 - cl- 创建。
 */

package com.zeroten.javales.map;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {
        // 集合类
        // Collection
        // List 列表
        // Set 集
        // Queue 队列
        // Map 键值对,散列
        // Set 累不死用的是对应的 Map 来实现的
        // Map 的 key 值即是存放 Set 的值
        // key 值对应的 Value 存放的是一个固定值 static new Object()
        // HashSet -> HashMap
        // TreeSet -> TreeMap
        // Map 中的值不可以重复。可以是null？
        // 因此,Set 的值不可以重复。可以是null？

        // TreeSet 是有序的,指的是它的值的顺序
        // TreeSet 的值不能是null???
        // 1. 构造 TreeSet 时如果指定了 Comparator, 则可以存放 null
        // 2. 构造 TreeSet 时如果未指定 Comparator, add 添加元素时需要调用元素对象的
        //      CompareTo 方法(Comparable 接口) 去比较元素的大小,因此不能存放 null
        // 如何排序：1. Comparator 接口比较2个值；2. Comparable 接口比较自身和另一个对象
        // 和 TreeMap 类似, TreeSet 内存放的元素必须实现 Comparable 接口
        // 但是,如果构造 TreeSet 时指定了 Comparator, 那么存放元素可以不用实现
        TreeSet<String> set = new TreeSet<>();
        set.add("str1"); // 内部调用的是 map.put("str1",PRESENT);
//        set.add(null);
        set.add("str3");
        set.add("str2");
        set.add("str3");
//        set.add(null);
        Iterator<String> iterator = set.iterator(); //map.key().iterator()
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        set.remove("str3"); // map.remove();
        System.out.println("set=" + set);

        TreeSet<TreeMapTest.BaseXueHao> set2 = new TreeSet<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
//        set2.add(null);
        set2.add(new TreeMapTest.BaseXueHao(1));
//        set2.add(null);
        System.out.println("set2=" + set2);

        HashSet<String> hashSet = new HashSet<>();
        // 无序的,可以存放 null, 但只能有一个null
        hashSet.add("str1");
//        hashSet.add(null);
        hashSet.add("str3");
        hashSet.add("str2");
//        hashSet.add(null);
        System.out.println("hashSet=" + hashSet);

        // Set 的主要作用？？ 判断某个指定的元素在集中是否存在
        if (hashSet.contains(null)) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }

        // LinkedHashSet
        // EnumSet,内部使用的是一个枚举类的数组
    }
}
