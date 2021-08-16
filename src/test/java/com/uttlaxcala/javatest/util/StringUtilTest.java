package com.uttlaxcala.javatest.util;


public class StringUtilTest {

    public static void main(String[] args) {

        assertEquals(StringUtil.repetir("hola", 3), "holaholahola");
        assertEquals(StringUtil.repetir("hola", 1), "hola");

    }

    private static void assertEquals(String actual, String expected){
        if (!actual.equals(expected)){
            throw new RuntimeException(actual + " is not equal to expected " + expected);
        }
    }
}