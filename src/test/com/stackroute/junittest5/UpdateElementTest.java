package com.stackroute.junittest5;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UpdateElementTest {

    UpdateElement object;

    @org.junit.Before
    public void setUp() throws Exception {
        object = new UpdateElement();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        object = null;
    }


    List<String> list =new ArrayList<String>();
    {
        list.add("apple");
        list.add("orange");
        list.add("grapes");
        list.add("mango");
    }
    List<String> updatedlist =new ArrayList<String>();
    {
        updatedlist.add("kiwi");
        updatedlist.add("orange");
        updatedlist.add("grapes");
        updatedlist.add("mango");
    }


    @org.junit.Test
    public void updateElement() {

        assertEquals(updatedlist, object.UpdateElement(list,"apple","kiwi"));

    }

    @org.junit.Test
    public void updateElement_1() {

        assertNotEquals(list,object.UpdateElement(updatedlist,"apple","kiwi"));

    }
}
