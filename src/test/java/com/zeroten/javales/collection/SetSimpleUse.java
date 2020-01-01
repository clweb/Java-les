/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： SetSimpleUse.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.collection;

import java.util.*;

public class SetSimpleUse {
    public static void main(String[] args) {
        //Set,集,不能有重复元素,可以有null
        //可能无序或有序
        //HashSet、TreeSet
        //LinkedHashSet,EnumSet
        //所有的集,都实现了 Set 接口,而 Set 接口继承自 Collection
        //所以我们可以说所有的集合都继承自 Collection
        //Set 和 Collection 接口的方法是完全一样的,仅是用于语义的用途
        HashSet<String> set = new HashSet<>();
        System.out.println(set instanceof Set);
        System.out.println(set instanceof Collection);
        System.out.println(set instanceof List);
        //添加
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("G");
        set.add("F");
        set.add("E");
        // 遍历 - for循环
        // 因为是无序的,同样的索引值取出来的值可能是不也一样的
//        for (int i = 0; i < set.size(); i++) {
//            String str = set.get(下标);
//        }
        //遍历 - 迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //list 有序,指的是按插入顺序来保存元素
        //TreeSet 有序,指的是元素按照一定规则来
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set1.add("4");
        set1.add("5");
        set1.add("6");
        // 遍历 - for循环
        for (int i = 0; i < set1.size(); i++) {
        }

        //遍历 - 迭代器
        Iterator<String> iterator1 = set1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //如果需要使用 HashSet 的
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("1");
        set2.add(null);
        set2.add("2");
        set2.add("3");
        set2.add("4");
        set2.add("5");
        set2.add("6");
        set2.add(null);
        set2.add("5");
        Iterator<String> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        //remove(元素索引);
        //remove(对象);
        //remove 方法如果成功删除,返回true 否者返回false
        set2.remove("5");
        System.out.println(set2.remove("7"));
        System.out.println("set2=" + set2);

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add(null);
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add(null);
        list.add("5");
        System.out.println("list=" + list);
        list.remove("3");
        //list.remove(10); //索引值不在[0 ~ size()) 区间,抛 IndexOutOfBoundsException 异常
        list.remove(null);

        List<String> removeList = new ArrayList<>();
        removeList.add("1");
        removeList.add(null);
        list.removeAll(removeList);
        System.out.println("removeList=" + removeList);

    }
}
