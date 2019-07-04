/*

Write a program to implement set interface which sorts the given randomly ordered names in

ascending order. Convert the sorted set in to an array list

*/

package com.stackroute.junittest5;

import java.util.*;

public class SortStringSet {

    public Set<String> sortArraySet(Set<String> set)
    {
        List<String> list = new ArrayList<String>();
        list.addAll(set);
        Collections.sort(list);
        System.out.print("The Sorted set is: ");

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.print("ArrayList from set: ");

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        Set<String> newSet=new LinkedHashSet<String>(list);
        return newSet;
    }

}
