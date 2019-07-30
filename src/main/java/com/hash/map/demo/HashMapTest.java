package com.hash.map.demo;

import com.hash.map.demo.ext.ExtHashMap;


/**
 * 纯手写ExtHashMap集合：基于数组+链表实现
 */
public class HashMapTest {

    public static void main(String[] args) {
        ExtHashMap extMap = new ExtHashMap();
        extMap.put("a", "aaa");
        extMap.put("b", "bbb");
        extMap.put("c", "ccc");
        extMap.put("b", "ddd");
        //ddd 没有覆盖 bbb why?
        String a = (String) extMap.get("b");
        System.out.println(a);
    }

    /**
     * 创建一个HashMap，初始容量默认为16，负载因子默认为0.75：
     * 1. 实际容量 = 初始容量 × 负载因子
     * 2. 计算可知，16×0.75=12，也就是当实际容量超过12时，这个HashMap就会扩容
     * 3. 初始容量设为不小于指定容量的2的次方的一个数（new HashMap(5),指定容量为5,那么实际初始容量为8，2^3=8>5）,且最大值不能超过2的30次方
     */

}
