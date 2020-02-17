/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： MapTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-13 - cl- 创建。
 */

package com.zeroten.javales.map;

import java.util.*;

public class HashMapTest {

    /**
     * 内容 -Map
     * <p>
     * 散列表相关知识
     * HashMap
     * 内部实现
     * 常用方法
     * TreeMap
     */
    // 散列表 HashTable：也是哈希表
    // 根据数组可以使用小标的方式来快速随机访问来实现的
    // 比如：
    //   存放一组数据： aaa, cde, bfk,...
    //    如何开速的定位和查找？

    // String[] str;
    // 哈希函数：将关键字转化成一个正整数
    // int hashFn(Object object)
    // aaa -> 256
    // cde -> 258
    // bfk -> 259
    // aak -> 256

    // str[256] = "aaa";
    // str[258] = "cde";
    // str[259] = "bfk";

    // 哈希函数最理想状态：
    // 1.哈希记过应该是一个正整数
    // 2.str1 == str2, hash(str1) == hash(str2)
    // 3.str1 != str2, hash(str1) != hash(str2)

    // 第三种情况基本不可能,不会存在这么一个函数.
    // MD5, SHA, CRC 这些算法都可能会产生重复的值

    // 哈希冲突： 不同的键值,通过哈希函数返回了相同的结果

    // 如何解决哈希冲突：链表方式
    // 数组里面不直接存值：存一个自定义对象
    // Node{
    //   node next;// 下一个节点
    //   node prev;// 前一个节点
    //   Object item;// 值
    // }
    // aaa -> 256
    // aak -> 256
    // str[256] = { prev: null; item: aaa, next: null };
    // str[256] = { prev: null; item: aak, next: 指向aaa };
    public static void main(String[] args) {
        /**
         * HashMap
         */
        // 1.构建
        Map<String, Student> map = new HashMap<>();
        // 2.添加
        map.put("001", new Student("张三", 23));
        map.put("002", new Student("李四", 20));
        map.put("005", new Student("李四1", 20));
        map.put("003", new Student("李四2", 20));
        map.put("008", new Student("李四3", 20));
        map.put("006", new Student("李四4", 20));
        // 3.遍历
        /**
         * 键值
         * Map 严格意义上来讲,不是一个集合,但是它可以返回3个试图
         * 可以把者三个思路当作集合类来操作
         * 3.1 键值视图 = Set
         * 3.2 值视图 = Collection
         * 3.3 键值对视图 = entry
         */
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<Student> values = map.values();
        System.out.println(values);
        Set<Map.Entry<String, Student>> kv = map.entrySet();
        System.out.println(kv);
        for (Map.Entry<String, Student> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        for (String key : keys) {
            System.out.println(key);
            Student val = map.get(key);
            System.out.println("get value:" + val);
        }
        // 4.删除
        map.remove("001");
        System.out.println(map);
        // list.remove(int index);// list 有序的
        // list.remove(Object object); // list有序的
        // set,map 无序的时候,不能使用下标的方式

        // 特殊元素 null
        map.put(null, new Student("无人", 0));
        map.put(null, null);
        System.out.println(map);

        Map<String, Student> map2 = new HashMap<>(map);
        System.out.println("map2=" + map2);

        Map<String, Student> map3 = new HashMap<>(10);

        // 构建：1.无参数构造; 2.使用一个已存在的Map作为初始值;3.指定容量大小
        // put(key,value)
        //     1. key 不存在,直接将 key -> value 存储,并返回 null
        //     2. key 已存在,将 key 值对应的值替换成新值,并返回旧值
        // V get(key)
        //     1. key 存在,则返回 key 值对应的值
        //     2. key 不存在,则返回 null
        // 时候存在
        //     1. key 是否存在 -containsKey
        //     2. value 是否存在 -containsValue
        // 遍历：可以获取集合的三种视图
        //      1 键值集 = keySet()
        //      2 值集 = values()
        //      3 键值对集 = entrySet(),如果没有仅使用 key 或 value 时,使用此遍历方式

        // 内部结构：散列表/哈希表,数组链表

        map.put("007", null);
        if (!map.containsKey("007")) {
            System.out.println("007不存在");
        } else {
            System.out.println("007存在");
        }
        Student student = new Student("李四", 20);
        student.equals(new Date());
        System.out.println(map.containsValue(student));
        // false,why?
        // 对应自定义类,equals 默认比较的是引用
        // 如果要实现值比较,主要覆写 equals 方法
        // 覆写 equals 方法的同时需要修改 hashCode 方法
        // 计算哈希值时,key.hashCode()
        // 在桶内比较某个 key 值是否存在使用的时 key.equals(inputKey)
        // "001":{name:"n1",age:2}
        // "010":{name:"n2",age:3}
        // hashCode() 返回的值相等时,equals() 比较应该返回 true
        // equals() 比较应该返回 true,那么 hashCode() 返回的值应该相等
        // hashCode 相等,equals() false
        // hashCode(001)=1,1 % 3 = 1
        // hashCode(010)=1,1 % 3 = 1
        // 循环链表找key,
        // hash ==hash && key.equals(inputKey) == false
        // {hash: 1, key:"001", value:{name:"n1",age:2}}
        // {hash: 1, key:"010", value:{name:"n2",age:3}}
        //存在相同的 key 值
        Map<Key, Student> map4 = new HashMap<>();
        map4.put(new Key(1), new Student("zs", 5));
        map4.put(new Key(1), new Student("zs", 5));
        System.out.println(map4);
    }

    static class Key {
        private Integer i;

        public Key(Integer i) {
            this.i = i;
        }

        @Override
        public int hashCode() {
            return i == null ? 0 : i.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                Key key = (Key) obj;
                return i != null & i.equals(key.i);
            }
            return false;
        }

        @Override
        public String toString() {
            return i.toString();
        }
    }

    static class Student {
        String name;
        Integer age;

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object instanceof Student) {
                Student stu = (Student) object;
                if (name != null && name.equals(stu.name) &&
                        age != null && age.equals(stu.age)) {
                    return true;
                }
            }
            return false;
        }


        @Override
        public String toString() {
            StringBuilder str = new StringBuilder();
            str.append(getClass().getSimpleName());
            str.append("{");
            str.append("name:");
            str.append(name);
            str.append(",");
            str.append("age:");
            str.append(age);
            str.append("}");
            return str.toString();
        }
    }

}
