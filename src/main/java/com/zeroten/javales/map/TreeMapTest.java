/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： TreeMapTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-16 - cl- 创建。
 */

package com.zeroten.javales.map;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        // HashMap 无序
        // TreeMap 有序,和List有序是不一样的
        // 1.构造
        // 2. 添加/删除/遍历/修改 (CRUD -- 增删改查)
        TreeMap<XueHao, String> map = new TreeMap<>();
        // key - 学生的序号
        // value - 学生的信息
        // 对应 TreeMap key值必须实现Comparable接口
        map.put(new XueHao(1), "zs,20");
        map.put(new XueHao(3), "张三,20");
        map.put(new XueHao(2), "李四,22");
        map.put(new XueHao(4), "王五,21");

        // Map 严格来说不是一个集合,但是它有三个视图,我们可以把这三个视图当作集合来使用
        // 1. key 集
        // 2. 值集合
        // 3. 键值对集
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
        for (Map.Entry<XueHao, String> item : map.entrySet()) {
            System.out.println(item.getKey() + "=" + item.getValue());
        }
        // TreeMap 是有序的,这个有序是指 key 的排序
        // 那么 key 是如何排序？
        // 1.构建TreeMap时,未指定排序器{即Comparator接口来实现},那么 key 值对象就必须通过实现排序接口 Comparable
        // 2.构建TreeMap时,指定排序器,那么 key 值对象可以不实现接口 Comparable
        // 存放元素的时候,会调用Comparable 接口中的CompareTo 方法,默认升序来排序
        // Comparable/Comparator 这两个之间的区别？
        // Comparable int CompareTo(T o)
        // Comparable 比较的是自身和传入对象的大学奥
        // Comparator 接口比较的是两个传入对象的大小
        // 当 put 添加元素或 remove 元素时,是使用比较器进行比较两个元素是否相等,而不是使用 equals()

        map.remove(new XueHao(4));
        System.out.println(map);

        String oldValue = map.put(new XueHao(2), "2-Update");
        System.out.println("旧值：" + oldValue);
        System.out.println(map);

        // 学生列表,既可以按学号正序排列,也可以反序排列？
//        final boolean ascOrder = false;
        TreeMap<BaseXueHao, String> map2 = new TreeMap<>(XueHaoOrderFactory.getComparator(false));
        map2.put(new BaseXueHao(1), "第一个学生");
        map2.put(new BaseXueHao(4), "第二个学生");
        map2.put(new BaseXueHao(2), "第三个学生");
        map2.put(new BaseXueHao(3), "第四个学生");
        map2.put(new BaseXueHao(null), "第五个学生");

        System.out.println(map2);

        // LinkedHashMap 具有和 HashMap 一样的功能
        // 增强：保持元素的插入顺序
        // LinkedHashMap 在HashMap 的基础三增加如下内容：
        // head 指向按插入顺序,第一个元素的引用
        // tail 指向按插入顺序,最后一个元素的引用
        // 对每一个元素的对象, Entry or Node 增加了两个属性
        // 1.before 指向按插入顺序,前一个元素的引用
        // 2.after 指向按插入顺序,后一个元素的引用
        LinkedHashMap<XueHao, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(new XueHao(1), "第一");
        linkedHashMap.put(new XueHao(5), "第w");
        linkedHashMap.put(new XueHao(2), "第d");
        for (Map.Entry<XueHao, String> item : linkedHashMap.entrySet()) {
            System.out.println(item.getKey() + "=" + item.getValue());
        }
        System.out.println(linkedHashMap);

        // WeakHashMap,当里面的某个元素不在被使用时,可以被垃圾回收器回收
        // EnumMap, key 值必须时枚举类型
        // IdentityHashMap, key 值的哈希值计算方式：通常：key值对象.hashCode()
        // IdentityHashMap 中 key 值的哈希值计算方式：System.identityHashCode(key);
        BaseXueHao xh = new BaseXueHao(1);
        System.out.println(xh);
        System.out.println(xh.hashCode());
        System.out.println(System.identityHashCode(xh));//地址的十进制数
        int hashCode = xh.hashCode();
        System.out.println(Integer.toHexString(hashCode));
    }

    static class XueHaoOrderFactory {
        public static Comparator getComparator(boolean isAsc) {
            return new Comparator() {
                @Override
                public int compare(Object one, Object two) {
                    if (one instanceof BaseXueHao && two instanceof BaseXueHao) {
                        BaseXueHao o1 = (BaseXueHao) one;
                        BaseXueHao o2 = (BaseXueHao) two;
                        if (o1.index < o2.index) {
                            return isAsc ? -1 : 1;
                        }
                        if (o1.index == o2.index) {
                            return 0;
                        }
                        return isAsc ? 1 : -1;
                    }
                    return -1;
                }
            };
        }
    }

    static class BaseXueHao {
        protected Integer index; //学号

        public BaseXueHao(Integer index) {
            if (index == null) {
                this.index = 0;
            } else {
                this.index = index;
            }

        }

        @Override
        public String toString() {
            return "学号:" + index;
        }

    }

    static class XueHao extends BaseXueHao implements Comparable {

        public XueHao(Integer index) {
            super(index);
        }


//        @Override
//        public String toString() {
//            return "学号:" + index;
//        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }

        @Override
        public int compareTo(@NotNull Object other) {
            // -1 0 1
            // 小于 other 时返回小于0的数：-1
            // 等于 other 时返回0
            // 大于 other 时返回大于0的数：1
            if (other instanceof XueHao) {
                XueHao xh = (XueHao) other;
                if (this.index < xh.index) {
                    return -1;
                }
                if (this.index == xh.index) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
    }


}
