package com.stackroute.junittest5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListCodeTest {
    ArrayListCode obj;
    @Before
    public void setUp() throws Exception {
        obj=new ArrayListCode();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void addArray() {
        String expexted="[Kiwi, Grape, Mango, Berry]";
        String actual=obj.addArray("Kiwi Grape Mango Berry".split(" ")).toString();
        assertEquals(expexted,actual);
    }
    @Test
    public void removeAll() {
        String expexted="[]";
        obj.addArray("Kiwi Grape Mango Berry".split(" "));
        String actual=obj.removeAll().toString();
        assertEquals(expexted,actual);
    }
    @Test
    public void update() {
        String expexted="[Kiwi, Grape, Mango, Berry]";
        obj.addArray("Apple Grape Melon Berry".split(" "));
        obj.update(0,"Kiwi");

        String actual=obj.update(2,"Mango").toString();
        assertEquals(expexted,actual);
    }
}