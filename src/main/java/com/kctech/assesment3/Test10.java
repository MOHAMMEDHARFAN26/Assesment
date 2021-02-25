package com.kctech.assesment3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
       l.add(1);
       l.add(1);
       l.add(2);
       l.add(3);
       l.add(3);
       l.add(3);
       l.add(4);
       l.add(5);
       l.add(6);
       l.add(6);
       l.add(6);
       l.add(7);
       l.add(8);
       
       System.out.println("Before removing duplicates: ");
       for (Integer s : l) {
            System.out.println(s);
       }
       Set<Integer> set = new HashSet<Integer>(l);
       List<Integer> newlist = new ArrayList<Integer>(set);
       System.out.println("after removing duplicates: ");
       for (Integer s : newlist) {
            System.out.println(s);
       }
    }
}
