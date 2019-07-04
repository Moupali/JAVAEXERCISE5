/*

Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.
Modify and return the given map as follows:
a. If the key `val1` has a value, set the key `val2` to have that value, and
b. Set the key `val1` to have the value `" "` (empty string).

*/

package com.stackroute.junittest5;

import java.util.Map;

public class ModifyKeyValues
{

    public Map<String,String> modifyValueInMap(Map<String,String> map)
    {
        for(Map.Entry<String,String> entry:map.entrySet())
        {
            if(entry.getKey().equals("val1")&&entry.getValue()!=null)
            {
                String value=entry.getValue();
                map.put("val1"," ");
                map.put("val2",value);
            }
            else{
                continue;
            }
        }
        return map;
    }

}
