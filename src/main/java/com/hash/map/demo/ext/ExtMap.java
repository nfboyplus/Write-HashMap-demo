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

}
