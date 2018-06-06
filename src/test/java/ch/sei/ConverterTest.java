package ch.sei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void convertMtoCM() {
        Converter c = new Converter();
        double result = c.convert("m", "cm", 100);
        assertEquals(10000,result);
    }

    @Test
    void convertKMtoCM() {
        Converter c = new Converter();
        double result = c.convert("km", "cm", 100);
        assertEquals(10000000,result);
    }

}