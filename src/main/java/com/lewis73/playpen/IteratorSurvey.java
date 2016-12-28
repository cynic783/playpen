package com.lewis73.playpen;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorSurvey {
    public static void main(String[] args) {
        List<Integer> source = new ArrayList<>();
        source.add(1);
        source.add(2);
        source.add(3);

        Map<String, List<Integer>> map = new HashMap<>();
        map.put("ArrayList", new ArrayList<>(source));
        map.put("LinkedList", new LinkedList<>(source));
        map.put("Collections.synchronizedList", Collections.synchronizedList(source));
        map.put("CopyOnWriteArrayList", new CopyOnWriteArrayList<>(source));

        for (String key : map.keySet()) {
            List<Integer> list = map.get(key);
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            try {
                it.remove();
                System.out.println(key + ": Iterator.remove IS supported");
            } catch (Exception e) {
                System.out.println(key + ": Iterator.remove is NOT supported; " + e.getClass().getSimpleName());
            }
            System.out.println(key + ": " + list);
            System.out.println();
        }
    }
}
