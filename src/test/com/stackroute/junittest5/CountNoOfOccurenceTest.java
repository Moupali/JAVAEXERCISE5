package com.stackroute.junittest5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountNoOfOccurenceTest {


    CountNoOfOccurence obj;

    @Before
    public void setUp() throws Exception {
        obj = new CountNoOfOccurence();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    Map<String, Boolean> map = new HashMap<String, Boolean>();

    {
        map.put("a", true);
        map.put("b", false);
        map.put("c", true);
        map.put("d", false);
    }

    String[] array = {"a", "b", "c", "d", "a", "c", "c"};

    String[] array1 = {"a", "b", "c", "d", "a"};

    @Test
    public void frequencyOfString() {
        assertEquals(map, obj.frequencyOfString(array));
    }

    @Test
    public void frequencyOfString_1() {
        assertNotEquals(map, obj.frequencyOfString(array1));
    }
}
