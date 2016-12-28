package com.lewis73.playpen;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListIteratorSurvey {
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
            ListIterator<Integer> it = list.listIterator();
            while (it.hasNext()) {
                it.next();
                System.out.println(key + ": ListIterator.next IS supported");
                try {
                    it.set(55);
                    System.out.println(key + ": ListIterator.set IS supported");
                    break;
                } catch (Exception e) {
                    System.out.println(key + ": ListIterator.set is NOT supported; " + e.getClass().getSimpleName());
                    break;
                }
            }
            try {
                it.previous();
                System.out.println(key + ": ListIterator.previous IS supported");
            } catch (Exception e) {
                System.out.println(key + ": ListIterator.previous is NOT supported; " + e.getClass().getSimpleName());
            }
            try {
                it.remove();
                System.out.println(key + ": ListIterator.remove IS supported");
            } catch (Exception e) {
                System.out.println(key + ": ListIterator.remove is NOT supported; " + e.getClass().getSimpleName());
            }
            try {
                it.add(66);
                System.out.println(key + ": ListIterator.add IS supported");
            } catch (Exception e) {
                System.out.println(key + ": ListIterator.add is NOT supported; " + e.getClass().getSimpleName());
            }
            System.out.println(key + ": " + list);
            System.out.println();
        }
    }
}
