package com.lewis73.playpen;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

// see OCPJ8P book page 592
public class ModifyListWhileIteratingSurvey {
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
            synchronized(list) {
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        list.add(55);
                        System.out.println(key + ": List.add IS supported");
                        try {
                            it.next();
                            System.out.println(key + ": Iterator.next IS supported after List.add");
                            break;
                        } catch (Exception e) {
                            System.out.println(key + ": Iterator.next NOT supported after List.add; " + e.getClass().getSimpleName());
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println(key + ": List.add NOT supported; " + e.getClass().getSimpleName());
                        break;
                    }
                }
                while (it.hasNext()) {
                    try {
                        list.remove((Integer) 55);
                        System.out.println(key + ": List.remove IS supported");
                        try {
                            it.next();
                            System.out.println(key + ": Iterator.next IS supported after List.remove");
                            break;
                        } catch (Exception e) {
                            System.out.println(key + ": Iterator.next NOT supported after List.remove; " + e.getClass().getSimpleName());
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println(key + ": List.remove NOT supported; " + e.getClass().getSimpleName());
                        break;
                    }
                }
            }
            System.out.println(key + ": " + list);
            System.out.println();
        }
    }
}
