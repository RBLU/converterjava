package ch.sei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void convert() {
        Converter c = new Converter();
        System.out.println(c.convert("m", "cm", 100));
    }
}