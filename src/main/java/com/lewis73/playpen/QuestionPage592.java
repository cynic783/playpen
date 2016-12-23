package com.lewis73.playpen;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Dan on 12/23/2016.
 */
public class QuestionPage592
{
   public static void main(String[] args)
   {
      List<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
      List<Integer> list2 = Collections.synchronizedList(Arrays.asList(1, 2, 3, 4, 5, 6));

      {
         ListIterator<Integer> it = list1.listIterator();
         while (it.hasNext())
         {
            Integer next = it.next();
            it.set(55);
         }
         it.previous();
         it.remove();
         it.add(66);
      }

      {
         ListIterator<Integer> it = list2.listIterator();
         while (it.hasNext())
         {
            Integer next = it.next();
            it.set(77);
         }
//         it.add(88);
         it.previous();
//         it.remove();
//         it.add(88);
      }


      System.out.println(list1);
      System.out.println(list2);

   }
}
