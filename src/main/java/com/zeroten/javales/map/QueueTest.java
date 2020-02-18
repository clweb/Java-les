/*
 * 版权所有(C)，XXX公司，2020，所有权利保留。
 * 项目名： java-les-maven-example-master
 * 文件名： QueueTest.java
 * 模块说明：
 * 修改历史:
 * 2020-2-17 - cl- 创建。
 */

package com.zeroten.javales.map;

import java.util.*;

public class QueueTest {

    // 队列 Queue
    //     队列指的是一种在队尾插入元素、在队头删除元素
    //     两端队列：可以在队尾/队头同时进行插入或删除
    // 队列的特点：只能在对头或队尾对元素进行操作,而不能在队列中间的元素进行操作
    //   先进先出：FIFO
    //   先进后出：
    // 队列的两个接口：Queue、Deque
    // 队列的三个实现类：
    //      1.LinkedList ->具有队列、两端队列的功能,内部使用链表来实现
    //      2.ArrayDeque ->具有队列、两端队列的功能,内部使用循环数组来实现
    //      3.PriorityQueue ->优先级队列,它内部实现结构可以快速把所有元素中最小的元素单独放出来
    //          最典型的应用场景：任务调度
    // 两个引用场景：任务调度、LRU
    // 两个工具： Arrays、Collections

    public static void main(String[] args) {
        //队列
//        testQueueOp();
        //  两端队列
//        testDequeOp();

        // 优先级队列：任务调度
        // 特点： 内部使用了一种堆()的数据结构, 是自我调整的二叉树
        //        当向队列中添加/删除元素的时候, 它能快速找到队列中最小的元素
        //        并且移动到树的根部, 而不用对所有元素进行排序
        // 对优先级队列进行排序的时候, 无序
        PriorityQueue<String> pq = new PriorityQueue();
        pq.add("1");
        pq.add("3");
        pq.add("5");
        pq.add("7");
        pq.add("2");
        pq.add("8");
        pq.add("6");
        pq.add("4");
        // 数组或者实现了 Iterable 接口的类可以使用 for each 语法
        for (String str : pq) {
            System.out.println(">" + str);
        }
        System.out.println("get：");
        // remove 删除并返回数组中最小的元素
        // 如果队列为空则抛 NoSuchElementException 异常
        // remove 方法之前判断队列是否为空
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
//        System.out.println(pq.remove());
        // TreeMap
        // 构建 TreeMap 时, 指定 Comparator
        // 未指定 Comparable 时, key 值对象必须实现 Comparable 接口
        // Comparable 和 Comparator 区别？？？
        // Comparable 比较自身和另一个对象, CompareTo
        // Comparator 比较的是传入的两个对象, compare
        // TreeMap

        // 优先级队列如何找最小元素：构建时指定 Comparator
        // 或者存放元素实现 Comparable 接口
        PriorityQueue<Task> taskList = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                if (o1.priority < o1.priority) {
                    return -1;
                }
                if (o1.priority == o2.priority) {
                    return 0;
                }
                return 1;
            }
        });
        for (int i = 0; i < 10; i++) {
            int priority = new Random().nextInt(10);
            taskList.add(new Task(priority, "级别" + (i + 1)));
        }
        System.out.println(taskList);

        //执行任务
        while (true) {
            if (taskList.isEmpty()) {
                System.out.println("任务执行完成,退出");
                break;
            }
            Task task = taskList.remove();
//            System.out.println("执行任务：" + task.name + ",优先级：" + task.priority);
            System.out.println(String.format("执行任务：%s,优先级：%d", task.name, task.priority));
        }
    }

    static class Task {
        private int priority;
        private String name;

        public Task(int priority, String name) {
            this.priority = priority;
            this.name = name;
        }

        @Override
        public String toString() {
            return "任务" + name + "(" + priority + ")";
        }
    }

    private static void testQueueOp() {
        // 队列
        // Queue 接口的方法
        Queue<String> queue = new LinkedList<>();
//        Queue<String> queue = new ArrayDeque<>();
        // 增删查改
        // 添加 add(E)\offer(E)
        // 在队列未满的情况下,添加元素到队列的尾部
        // 如果队列已满：add() 抛异常 IllegalStateException()
        //              offer() 返回 false
        // 增
        queue.add("str1");
        queue.add("str3");
        queue.offer("str2");
        queue.offer("str4");

        // 删
        // remove/poll
        // 如果队列不为空,删除并返回对头的元素
        // 如果队列为空, remove 抛异常 NoSUchElementException
        //              poll 返回 null
        // 如果使用 remove 来获取队尾元素时, remove 前需要判断队列是否为空
        // size()== 0 /isEmpty()
        // 如果使用 poll 来获取队尾元素时, 获取到结果后, 先判断结果是否为空
        //        System.out.println("remove=" + queue.remove());
        //        System.out.println(queue);
        //        System.out.println("remove=" + queue.remove());
        //        System.out.println(queue);
        //        System.out.println("remove=" + queue.remove());
        //        System.out.println(queue);
        //        System.out.println("remove=" + queue.remove());
        //        System.out.println(queue.size());
        //        System.out.println(queue.isEmpty());
        //        System.out.println("poll=" + queue.poll());
        //        System.out.println("remove=" + queue.remove());

        // 查, 仅查看对头元素时什么,不删除
        // element/peek
        // 如果队列不为空, 返回队列的头部元素, 但不删除
        // 队列为空时: element 抛异常 NoSUchElementException
        //             peek 返回 null
        // 注意：调用 element 方法前判断队列是否为空
        //       调用 peek 方法后先判断返回结果是否为 null
//        queue.clear();
        System.out.println(queue);
        System.out.println("队头元素element()=" + queue.element());
        System.out.println("队头元素peek()=" + queue.peek());
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
        // 改,一般没有修改操作
    }

    private static void testDequeOp() {
        // 两端队列 Deque：增删查
        Deque<String> deque = new LinkedList<>();

        // 增：(deque: add/offer)
        //      addFirst/addLast/offerFirst/offerLast
        // 队列不为空时,在对头或队尾添加元素
        // 如果队列已满, addFirst/addLast 抛异常 IllegalStateException()
        //              offerFirst/offerLast 返回 false
        deque.addLast("str1");
        deque.addLast("str3");
        deque.addFirst("str2");
        deque.addFirst("str4");
        System.out.println(deque);

        // 删：(deque: remove/poll)
        //      removeFirst/removeLast/pollFirst/pollLast
        // 队列非空时, 删除并返回队头或队尾的元素
        // 队列为空时, removeFirst/removeLast 抛异常 NoSuchElementException
        //              pollFirst/pollLast 返回 null
        // 注意：removeXXX 方法前判断队列是否为空
        //       pollXXX 方法后先判断返回结果是否为 null
//        System.out.println(deque.removeFirst());
//        System.out.println(deque.removeLast());
//        System.out.println(deque.removeLast());
//        System.out.println(deque.removeLast());
//        System.out.println(deque);
        //        deque.removeFirst();
        //        deque.removeLast();
//        System.out.println(deque.pollFirst());
//        System.out.println(deque.pollLast());

        // 查：(deque: element/peek)
        //      getFirst/getLast/peekFirst/peekLast
        // 队列非空时, 返回队头或队尾的元素, 但不删除
        // 队列为空时, getFirst/getLast 抛异常 NoSuchElementException
        //              peekFirst/peekLast 返回 null
        // 注意：getXXX 方法前判断队列是否为空
        //       peekXXX 方法后先判断返回结果是否为 null
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque);
        deque.clear();
        System.out.println(deque);
    }
}
