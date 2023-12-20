package com.example.converterapplab1.converters;

import java.util.HashMap;
import java.util.Map;

public class WeightConverter {
    private static final String POUND = "POUND";
    private static final String KILOGRAM = "KILOGRAM";
    private static final String GRAM = "GRAM";
    private static final String PUD = "PUD";
    private static final String CARAT = "CARAT";
    private static final String TONNE = "TONNE";

    public String convert(double value, String fromValue, String toValue) {
        double result = 0.0;
        switch (fromValue) {
            case POUND:
                switch (toValue) {
                    case KILOGRAM:
                        result = value * 0.453592;
                        break;
                    case GRAM:
                        result = value * 453.592;
                        break;
                    case PUD:
                        result = value * 0.061048;
                        break;
                    case CARAT:
                        result = value * 2267.96;
                        break;
                    case TONNE:
                        result = value * 0.000453592;
                        break;
                    default:
                        result =value;
                        break;
                }
                break;
            case KILOGRAM:
                switch (toValue) {
                    case POUND:
                        result = value * 2.20462;
                        break;
                    case GRAM:
                        result = value * 1000;
                        break;
                    case PUD:
                        result = value * 0.163804;
                        break;
                    case CARAT:
                        result = value * 5000;
                        break;
                    case TONNE:
                        result = value * 0.001;
                        break;
                    default:
                        result =value;
                        break;
                }
                break;
            case GRAM:
                switch (toValue) {
                    case POUND:
                        result = value * 0.00220462;
                        break;
                    case KILOGRAM:
                        result = value * 0.001;
                        break;
                    case PUD:
                        result = value * 0.000163804;
                        break;
                    case CARAT:
                        result = value * 5;
                        break;
                    case TONNE:
                        result = value * 1e-6;
                        break;
                    default:
                        result =value;
                        break;
                }
                break;
            case PUD:
                switch (toValue) {
                    case POUND:
                        result = value * 16.3807;
                        break;
                    case KILOGRAM:
                        result = value * 6.11687;
                        break;
                    case GRAM:
                        result = value * 6116.87;
                        break;
                    case CARAT:
                        result = value * 30000;
                        break;
                    case TONNE:
                        result = value * 0.00611687;
                        break;
                    default:
                        result =value;
                        break;
                }
                break;
            case CARAT:
                switch (toValue) {
                    case POUND:
                        result = value * 0.000440925;
                        break;
                    case KILOGRAM:
                        result = value * 0.0002;
                        break;
                    case GRAM:
                        result = value * 0.2;
                        break;
                    case PUD:
                        result = value * 3.33333e-5;
                        break;
                    case TONNE:
                        result = value * 2e-7;
                        break;
                    default:
                        result =value;
                        break;
                }
                break;
            case TONNE:
                switch (toValue) {
                    case POUND:
                        result = value * 2204.62;
                        break;
                    case KILOGRAM:
                        result = value * 1000;
                        break;
                    case GRAM:
                        result = value * 1e+6;
                        break;
                    case PUD:
                        result = value * 1638.71;
                        break;
                    case CARAT:
                        result = value * 5e+6;
                        break;
                    default:
                        result =value;
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
