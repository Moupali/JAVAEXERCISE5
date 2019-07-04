/*

Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array

*/
package com.stackroute.junittest5;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfOccurence
{

    public Map<String,Boolean> frequencyOfString(String[] input)
    {

        Map<String,Boolean> map=new HashMap<String, Boolean>();

        for(int i=0;i<input.length;i++)
        {
            //checking the occurence
            if(map.containsKey(input[i]))
            {
                //if found,will return true
                map.put(input[i], true);
            } else
                {
                    //if found,will return true
                    map.put(input[i], false);
            }

        }
        return map;


    }

}