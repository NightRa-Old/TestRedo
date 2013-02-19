// Created by Ilan Godik

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestWordTest {

    @Test
    public void test1() {
        String s = "good morning hugim";
        assertEquals(7, LongestWord.getLongestWordLength(s));
    }

    @Test
    public void test2() {
        String s = "good morning hugimWorld!!";
        assertEquals(12, LongestWord.getLongestWordLength(s));
    }

    @Test
    public void test3() {
        String s = "good morning hugim";
        assertEquals(7, LongestWord.getLongestWordLength1(s));
    }

    @Test
    public void test4() {
        String s = "good morning hugimWorld!!";
        assertEquals(12, LongestWord.getLongestWordLength1(s));
    }

    @Test
    public void test5() {
        String s = "good morning hugim";
        assertEquals(7, LongestWord.getLongestWordLength2(s));
    }

    @Test
    public void test6() {
        String s = "good morning hugimWorld!!";
        assertEquals(12, LongestWord.getLongestWordLength2(s));
    }

    @Test
    public void test7() {
        String s = "good morning hugim";
        assertEquals(7, LongestWord.getLongestWordLength3(s));
    }

    @Test
    public void test8() {
        String s = "good morning hugimWorld!!";
        assertEquals(12, LongestWord.getLongestWordLength3(s));
    }
}
