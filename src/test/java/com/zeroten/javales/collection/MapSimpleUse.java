/*
 * 版权所有(C)，XXX公司，2019，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： MapSimpleUse.java
 * 模块说明：
 * 修改历史:
 * 2019-12-31 - cl- 创建。
 */

package com.zeroten.javales.collection;

import java.util.HashMap;
import java.util.Map;

public class MapSimpleUse {
    public static void main(String[] args) {
        // Map 键值对,包含键值、值;
        //可以通过键值快速找到对应的值
        //示例：
        //001 -> {name:张三, age: 20 .....}
        //001 -> {name:王五, age: 20 .....}
        //002 -> {name:李四, age: 21 .....}
        //特性：
        //  1.键值 (key) 不能重复
        //  2.put() 方法如果键值已经存在,那么就会使用新值替换旧值,并且返回旧值
        //  3.键值key可以是 null吗？ --可以
        //  4.值value可以是 null 吗？ --可以
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "张三,20");
        map.put(1, "王五,23");
        map.put(2, "李四,21");

        String val1 = map.get(1);
        System.out.println(val1);
    }
}
