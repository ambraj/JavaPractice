package com.luv2code.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapPractice {

    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        //        map = Collections.synchronizedMap(map);

        // iterating entry set
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
            map.put("four", 4);
        }

        for (Integer value : map.values()) {
            System.out.println("value: " + value);
        }

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println("key: " + key);
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }

        //////////////////////////////////////

        List<String> balls = Arrays.asList("red", "red", "red", "green", "red", "green", "blue");

        Map<String, Integer> ballMap = new HashMap<>();

        for (String ball : balls) {
            if (ballMap.containsKey(ball)) {
                ballMap.put(ball, (ballMap.get(ball) + 1));
            } else {
                ballMap.put(ball, 1);
            }
        }
        System.out.println(ballMap.toString());

    }

}
