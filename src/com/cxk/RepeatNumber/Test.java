package com.cxk.RepeatNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XingKe
 * @date 2019-06-12 21:13
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String> repeatMap = new HashMap<String, String>();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i);
            String old = map.get(key);
            if (old != null) {
                map.put(key, old + "," + (i));
                repeatMap.put(key, old + "," + (i));
            } else {
                map.put(key, "" + (i));
            }
        }
        for (String result: repeatMap.keySet()) {
            if (map.containsKey(result)){
                map.remove(result);
            }
        }
        System.out.println(repeatMap);
        System.out.println(map);
    }
}
