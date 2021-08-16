package com.uttlaxcala.javatest.util;

import org.junit.Test;

import static com.uttlaxcala.javatest.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_than_8_letters() {
        assertEquals(WEAK,PasswordUtil.assessPassword("123as!"));
    }

    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK,PasswordUtil.assessPassword("ascnmabshd"));
    }

    @Test
    public void medium_when_has_letters_and_number() {
        assertEquals(MEDIUM,PasswordUtil.assessPassword("ABCD1234"));
    }

    @Test
    public void strong_when_has_letters_number_and_symbol() {
        assertEquals(STRONG,PasswordUtil.assessPassword("ABCD1234!"));
    }
}