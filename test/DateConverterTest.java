// Created by Ilan Godik

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateConverterTest {
    @Test
    public void testConvertToUSA() throws Exception {
        String date = "13/06/2013";
        assertEquals("06/13/2013",DateConverter.convertToUSA(date));
    }
}
