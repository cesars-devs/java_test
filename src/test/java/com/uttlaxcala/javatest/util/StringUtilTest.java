package com.uttlaxcala.javatest.util;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repetir_string_once() {

        Assert.assertEquals("hola", StringUtil.repetir("hola", 1) );

    }

    @Test
    public void repetir_string_multiple_times() {

        Assert.assertEquals("holaholahola", StringUtil.repetir("hola", 3) );
    }

    @Test
    public void repetir_string_zero_times() {

        Assert.assertEquals("", StringUtil.repetir("hola", 0) );

    }

    @Test(expected = IllegalArgumentException.class)
    public void repetir_string_negative_times() {

        Assert.assertEquals("", StringUtil.repetir("hola", -1) );

    }
}