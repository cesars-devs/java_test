package com.uttlaxcala.javatest.util;


public class StringUtil {

    public static String repetir(String str, int times){
        String result="";

        if (times < 0){
            throw new IllegalArgumentException("Negative times not allowed");
        }
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
