package ch.sei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void convertMtoM() {
        Converter c = new Converter();
        double result = c.convert("m", "m", 100);
        assertEquals(100,result);
    }

    @Test
    void convertMtoKM() {
        Converter c = new Converter();
        double result = c.convert("m", "km", 1);
        assertEquals(0.001,result);
    }

    @Test
    void convertKMtoCM() {
        Converter c = new Converter();
        double result = c.convert("km", "cm", 1);
        assertEquals(100000,result);
    }

    @Test
    void convertMtoY() {
        Converter c = new Converter();
        double result = c.convert("m", "y", 1);
        assertEquals(1.1111111111111112,result);
    }

}