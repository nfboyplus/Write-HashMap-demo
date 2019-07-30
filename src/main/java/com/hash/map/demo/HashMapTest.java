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

}
