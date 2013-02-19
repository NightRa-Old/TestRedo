// Created by Ilan Godik

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpanderTest {
    @Test
    public void testExpandString() {
        String s = "a3st2v";
        assertEquals("aaasttv", Expander.expandString(s));
    }

    @Test
    public void testExpandString2() {
        String s = "abc2def4pk";
        assertEquals("abccdeffffpk", Expander.expandString(s));
    }

    @Test
    public void testIsNumber() {
        char c = '3';
        assertEquals(true, Expander.isNumber(c));
    }

    @Test
    public void testGetNum(){
        char c = '8';
        assertEquals(8,Expander.getNum(c));
    }
}
