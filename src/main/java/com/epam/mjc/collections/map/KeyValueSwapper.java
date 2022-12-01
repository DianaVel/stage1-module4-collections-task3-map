package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map <String, Integer> res = new HashMap<>();
        for (int key: sourceMap.keySet()){
            String val = sourceMap.get(key);
            if(!res.containsKey(val) || res.get(val)>key) res.put(val,key);
        }
        return res;
    }
}
