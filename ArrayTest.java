package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Computers on 7/18/2016.
 */
public class ArrayTest {

    Array intList1 = new Array(5);
    Array intList2 = new Array(3);

    @Test
    public void add() throws Exception {

        intList1.add(6);
        String expected = "[0,0,0,0,0,6]";
        String actual   = intList1.toString();

        assertEquals(expected , actual);
    }

    @Test
    public void add1() throws Exception {

        intList1.add(3,3);
        String expected = "[0,0,0,3,0,0]";
        String actual   = intList1.toString();

        assertEquals(expected , actual);

    }

    @Test
    public void replace() throws Exception {

        intList1.replace(2,3);
        String expected = "[0,0,3,0,0]";
        String actual   = intList1.toString();

        assertEquals(expected , actual);

        intList2.replace(0,1);
        String expected1 = "[1,0,0]";
        String actual1  = intList2.toString();

    }

    @Test
    public void get() throws Exception {

        intList1.replace(4,4);

        int expected = 4;
        int actual = intList1.get(4);

        assertEquals(expected , actual);
    }

    @Test
    public void remove() throws Exception {

        intList1.replace(3,3);
        intList1.replace(2,2);
        intList1.remove(2);

        String expected = "[0,0,3,0]";
        String actual = intList1.toString();

        assertEquals(expected , actual);

    }

    @Test
    public void isEmpty() throws Exception {

        boolean expected = false;
        boolean actual = intList2.isEmpty();

        assertEquals(expected , actual);

        intList1.clear();
        boolean expested1 = true;
        boolean actual1 = intList1.isEmpty();

        assertEquals(expested1 , actual1);

    }

    @Test
    public void size() throws Exception {

        int expected = 5;
        int actual = intList1.size();

        assertEquals(expected , actual);

        intList1.clear();
        int expected1 = 0;
        int actual1 = intList1.size();

        assertEquals(expected1 , actual1);

    }

    @Test
    public void contains() throws Exception {

        intList1.replace(0,1);
        intList1.replace(1,2);
        intList1.replace(2,3);

        boolean expected = true;
        boolean actual = intList1.contains(1);

        assertEquals(expected , actual);

        boolean expected1 = false;
        boolean actual1 = intList1.contains(6);

        assertEquals(expected1 , actual1);

    }

    @Test
    public void trimToSize() throws Exception {

        intList1.trimToSize(3);
        String expected = "[0,0,0]";
        String actual = intList1.toString();

        assertEquals(expected ,actual);

    }

    @Test
    public void clear() throws Exception {

        intList1.clear();
        boolean expected = true;
        boolean actual = intList1.isEmpty();

        assertEquals(expected , actual);

    }

}