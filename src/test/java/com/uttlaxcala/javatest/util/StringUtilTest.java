package com.uttlaxcala.javatest.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepetir() {

        Assert.assertEquals("holaholahola", StringUtil.repetir("hola", 3) );
        Assert.assertEquals("hola", StringUtil.repetir("hola", 1) );

    }
}