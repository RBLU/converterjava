package ch.sei;

import java.util.HashMap;

public class Converter   {
    static HashMap<String, Double> units = new HashMap();

    public Converter() {
        units.put("m", 1.0);
        units.put("km", 1000.0);
        units.put("cm", 0.01);
        units.put("y", 0.9);
        units.put("mi", 1590.0);
    }

    public double convert(String from, String to, double value) {
        return value * units.get(from) / units.get(to);
    }
}
