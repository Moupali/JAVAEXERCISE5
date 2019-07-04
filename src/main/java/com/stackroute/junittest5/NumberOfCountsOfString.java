/*

Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.

*/

package com.stackroute.junittest5;

import java.util.HashMap;

public class NumberOfCountsOfString {

    public HashMap<String, Integer> findTheCounts(String str) {

        String result = str.replaceAll("[-+.^:,@___<>*?_]", " ");

        HashMap<String, Integer> find = new HashMap<>();

        String []str1=result.split(" ");

        for(int i=0;i<str1.length;i++)
        {

            if(find.get(str1[i])==null)
            {
                find.put(str1[i],1);
            }
            else
                find.put(str1[i],find.get(str1[i])+1);
        }
        find.remove("");
        return find;
    }


}