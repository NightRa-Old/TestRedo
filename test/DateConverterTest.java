// Created by Ilan Godik

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateConverterTest {
    //Please note that because I'm forced to put everything into one method, I can't really test much.
    
    @Test
    public void testConvertToUSA() throws Exception {
        String date = "13/06/2013";
        assertEquals("06/13/2013",DateConverter.convertToUSA(date));
    }
}
