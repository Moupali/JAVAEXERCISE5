package com.stackroute.junittest5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class NumberOfCountsOfStringTest {

    NumberOfCountsOfString obj;

    @Before
    public void setUp() throws Exception {
        obj = new NumberOfCountsOfString();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    //-------------------------------------------------------------------
    HashMap<String, Integer> find = new HashMap<>();
    {
        find.put("one",5);
        find.put("two",2);
        find.put("three",2);
    }
    String test="one one -one___two,,three,one @three*one?two";
    String test1="one one -one___two,,three,one @three";

    @Test
    public void findTheCounts() {

        assertEquals(find,obj.findTheCounts(test));
    }

    @Test
    public void findTheCounts_1() {

        assertNotEquals(find,obj.findTheCounts(test1));
    }
}
