/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： CollectionSimpUser.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.collection;

import java.util.*;

public class ListSimpleUse {
    public static void printAllElement(List<String> list) {
        System.out.println("list的元素个数：" + list.size());

        // 遍历 - for循环使用元素索引的方式
        System.out.print("使用for循环遍历：");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (i > 0) {
                System.out.print(',');
            }
            System.out.print(str);
        }

        System.out.print("\n" + "使用迭代器循环：");
        //遍历 - 使用迭代器方式
        Iterator<String> iterator = list.iterator();
        //迭代器的位置是在元素之间
        //存在 n 个元素的列表,迭代器的位置可能存在 n + 1
        //获取迭代器后,迭代器的位置在第一个元素之前
        //未调用 next() 方法时,调用 remove 抛  IllegalStateException 异常
        //remove() 方法删除的时调用 next() 方法时返回的元素(越过的元素)
        //iterator.remove();
        while (iterator.hasNext()) {
            //next 方法有两个作用
            //1.将迭代器的位置移动到下一个位置
            //2.同时返回越过的元素
            String str = iterator.next();
            System.out.print(str + ',');
        }
        //当迭代器达到最后一个元素之后时,
        // 再调用next()方法,抛NoSuchElementException异常
        //System.out.println(iterator.next());
        System.out.print("\n" + "元素删除后：");
        list.remove(2);
        list.remove("E");
        System.out.println(list);
    }

    public static void main(String[] args) {
        //集合分为两大类
        //1.单个元素的序列,全部都实现了 Collection 接口
        //1.1 List,有序的,按照插入顺序排序,可以有重复的元素
        //1.2 Set,集,不可以有重复元素,可以包含 null值
        //1.3 Queue,队列,按一定规则进行添加/删除
        //2.键值对,全部都实现了 Map 接口

        //可以通过<>括号来指导列表里要放的元素类型
        //如果 add 添加了不同的类型
        List<String> list = new ArrayList<>();
        list.add("H");
        list.add("O");
        list.add("L");
        list.add("E");
        list.add("L");
        printAllElement(list);

        List<String> list2 = new LinkedList<>();
        list2.add("1");
        list2.add("3");
        list2.add("4");
        list2.add("6");
        list2.add("2");
        list2.add("5");
        printAllElement(list2);

        List list3 = new ArrayList();
        list3.add(1);
        list3.add("str");
        list3.add(new ListSimpleUse().new CustomClass());
        list3.add(new Date());
        System.out.println(list3);

        // 如果需要进行强制类型转换时,需要使用 instanceof 来判断该变量的实际类型
        for (int i = 0; i < list3.size(); i++) {
            Object obj = list3.get(i);
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println("字符串：" + str);
            } else if (obj instanceof Integer) {
                Integer it = (Integer) obj;
                System.out.println("int型数值:" + it);
            } else if (obj instanceof Date) {
                Date date = (Date) obj;
                System.out.println("日期：" + date);
            } else {
                System.out.println("不支持的类型：" + obj.getClass().getName());
            }
        }

        //继承链
        //A -> B -> C -> D
        //从字类的角度来看,它的所有父类都是它的继承链上的对象
        //从 C 来看：C、B、A 是 C 继承链上的对象
        //从 B 来看：B、A 是 B 继承链上的对象
        //instanceof 判断的是自己是否实现了继承链上的对象
        // C c;
        // c instanceof D == false;
        // c instanceof C == true;
        // c instanceof B == true;
        // c instanceof A == true;
        // c instanceof Object == true;
        //instanceof 判断的是自己继承链上对象是否实现了某个接口
        // class B implements JK1,JK3
        // class A implement JK0
        // c instanceof JK1 == true;
        // c instanceof JK3 == true;
        // c instanceof JK0 == true;

    }

    class CustomClass {
    }
}
