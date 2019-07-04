package com.stackroute.junittest5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyKeyValuesTest {

    ModifyKeyValues obj;
    @Before
    public void setUp() throws Exception {
        obj = new ModifyKeyValues();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void modifyKeyValueInMap() {

        Map<String,String> input=new HashMap<String, String>();
        input.put("value1","mars");
        input.put("value2","saturn");
        System.out.println(input);

        Map<String,String> result=new HashMap<String, String>();
        result.put("value1","mars");
        result.put("value2","saturn");
        System.out.println(result);

        assertEquals(result,obj.modifyValueInMap(input));
    }
    @Test
    public void modifyKeyValueInMap1() {
        Map<String,String> input=new HashMap<String, String>();
        input.put("value1","JAVA");
        input.put("value2","C++");
        System.out.println(input);
        Map<String,String> result=new HashMap<String, String>();
        result.put("value1","JAVA");
        result.put("value2","C++");
        System.out.println(result);
        assertEquals(result,obj.modifyValueInMap(input));
    }

}

