package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map <String, Integer> res = new HashMap<>();
        for (String str : sentence.split("[ .,]")){
            if(str.length()==0) continue;
            str = str.toLowerCase();
            if(res.containsKey(str)){
                res.put(str,res.get(str)+1);
            }else {
                res.put(str,1);
            }
        }
        return res;
    }
}
