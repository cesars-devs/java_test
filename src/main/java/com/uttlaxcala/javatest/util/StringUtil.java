package com.uttlaxcala.javatest.util;

public class StringUtil {

    public static String repetir(String str, int times){
        String result="";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
