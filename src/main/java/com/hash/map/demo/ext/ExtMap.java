package com.hash.map.demo.ext;

/**
 * 自定义Map集合
 */
public class ExtMap {

    ExtEntry[] arr = new ExtEntry[999];

    int size;

    public void put(Object key, Object value){
        int a = key.hashCode() % arr.length;
        ExtEntry e = new ExtEntry();
        e.key = key;
        e.value = value;
        arr[a] = e;
    }

    public Object get(Object key) {
        return arr[key.hashCode() % arr.length];
    }

    /**
     * put()方法大概过程如下：
     * 1. 如果添加的key值为null，那么将该键值对添加到数组索引为0的链表中，不一定是链表的首节点；
     * 2. 如果添加的key不为null，则根据key计算数组索引的位置；
     * 3. 数组索引处存在链表，则遍历该链表，如果发现key已经存在，那么将新的value值替换旧的value值；
     * 4. 数组索引处不存在链表，将该key-value添加到此处，成为头节点；
     * /

     /**
     get()方法的大概过程：
     * 1. 如果key为null，那么在数组索引table[0]处的链表中遍历查找key为null的value；
     * 2. 如果key不为null，根据key找到数组索引位置处的链表，遍历查找key的value，找到返回value，若没找到则返回null；
     */

}
