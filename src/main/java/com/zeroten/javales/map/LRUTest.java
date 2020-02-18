/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： LRUTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-17 - cl- 创建。
 */

package com.zeroten.javales.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUTest {

    public static void main(String[] args) {
        // LRU: Least Recently Used, 最近最少使用
        // 缓存：缓存热点数据,经常使用的数据
        // 缓存的一种淘汰算法
        // 当缓存已满时,再向缓存内添加内容时,
        // 删除(淘汰)掉缓存中已存在元素最近最少被使用的哪个元素
        // LinkedHashMap 支持 URL 算法
        // LinkedHashMap 具有 HashMap 的所有功能 + 可保持插入顺序(遍历)
        // HashMap + 双向链表
        // 双向链表: head/tail, after/before
        // LinkedHashMap 是有序的
        //      1. 插入顺序：每次插入元素,将元素放到双向链表的末尾
        //      2. 访问顺序：每次插入/获取元素, 将插入元素或者获取访问的元素放到双向链表的末尾
        //
        LRU<String, String> lru = new LRU<>();
        lru.put("001", "张三");
        lru.put("002", "李四");
        lru.put("003", "王五");
        lru.put("004", "赵六");
        lru.put("005", "谢八");

        System.out.println(lru);

        System.out.println(lru.get("003"));
        System.out.println(lru);
        System.out.println(lru.get("001"));
        System.out.println(lru);

        lru.put("006", "新家");
        System.out.println(lru);

        lru.put("005", "新8");
        System.out.println(lru);

    }

    static class LRU<K, V> extends LinkedHashMap<K, V> implements Map<K, V> {
        private int maxCount = 5;

        public LRU() {
            super(16, 0.75F, true);
        }

        public LRU(int maxCount) {
            super(16, 0.75F, true);
            this.maxCount = maxCount;
        }

        // 参数: eldest 最近最少使用
        // 当调用 put 方法并且 key 值不存在时,调用
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            boolean remove = size() > maxCount;
            if (remove) {
                System.out.println("淘汰最近最少的元素" + eldest);
            }
            return remove;
        }
    }
}
