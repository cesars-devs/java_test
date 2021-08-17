package com.uttlaxcala.javatest.util;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringUtilTest {
    private StringUtil string;

    @Before
    public void setup(){
        string = new StringUtil();
    }

    @Test
    public void is_not_empty(){

        Assert.assertEquals(false, string.isEmpty("a2s"));
    }

    @Test
    public void is_empty_when_string_is_null(){

        Assert.assertEquals(true, string.isEmpty(null));
    }

    @Test
    public void is_empty_when_string_is_space(){

        Assert.assertEquals(true, string.isEmpty(" "));
    }

    @Test
    public void is_empty(){

        Assert.assertEquals(true, string.isEmpty(""));
    }

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