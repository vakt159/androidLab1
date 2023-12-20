package com.example.converterapplab1.converters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemperatureConverter {
    private static final String CELSIUS = "CELSIUS";
    private static final String FAHRENHEIT = "FAHRENHEIT";
    private static final String KELVIN = "KELVIN";

    public String convert(double value, String fromValue, String toValue) {
        double result = 0.0;
        switch (fromValue) {
            case CELSIUS:
                switch (toValue) {
                    case FAHRENHEIT:
                        result = (value * 9 / 5) + 32;
                        break;
                    case KELVIN:
                        result = value + 273.15;
                        break;
                    default:
                        result=value;
                        break;
                }
                break;
            case FAHRENHEIT:
                switch (toValue) {
                    case CELSIUS:
                        result = (value - 32) * 5 / 9;
                        break;
                    case KELVIN:
                        result = (value + 459.67) * 5 / 9;
                        break;
                    default:
                        result=value;
                        break;
                }
                break;
            case KELVIN:
                switch (toValue) {
                    case CELSIUS:
                        result = value - 273.15;
                        break;
                    case FAHRENHEIT:
                        result = (value * 9 / 5) - 459.67;
                        break;
                    default:
                        result=value;
                        break;
                }
                break;
        }
        return formatter(result);
    }
    public static String formatter(Double number) {
        if (number == null) {
            return null;
        }

        // Використовуємо метод String.format для форматування числа з точністю до двох десяткових знаків
        String formattedNumber = String.format("%.10f", number);

        // Видаляємо нулі, що знаходяться після двох десяткових знаків
        formattedNumber = formattedNumber.replaceAll("0*$", "");

        // Видаляємо крапку, якщо вона залишається на кінці
        formattedNumber = formattedNumber.replaceAll("\\.$", "");

        return formattedNumber;
    }
}
