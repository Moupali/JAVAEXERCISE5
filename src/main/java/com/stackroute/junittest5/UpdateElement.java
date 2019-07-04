/*

Write a Java program to update specific array element by given element and empty the array list.

*/

package com.stackroute.junittest5;

import java.util.List;
import java.util.ListIterator;

public class UpdateElement {

    public List<String> UpdateElement(List<String> list, String value , String updatevalue)
    {
        ListIterator<String> itr=list.listIterator();

        while(itr.hasNext())
        {
            String next=itr.next();
            if(next.equals(value))
            {
                itr.set(updatevalue);
            }

        }
        return list;

    }

}
