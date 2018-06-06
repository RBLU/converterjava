package ch.sei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void convert() {
        Converter c = new Converter();
        long result = c.convert("m", "cm", 100);
        assertEquals(10000,result);
    }
}