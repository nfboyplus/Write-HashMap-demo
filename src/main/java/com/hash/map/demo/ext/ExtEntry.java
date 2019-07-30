package com.hash.map.demo.ext;

import lombok.Data;

@Data
public class ExtEntry {

    Object key;
    Object value;

    public ExtEntry(Object key, Object value) {
        super();
        this.key = key;
        this.value = value;
    }

    public ExtEntry() {
    }
}
