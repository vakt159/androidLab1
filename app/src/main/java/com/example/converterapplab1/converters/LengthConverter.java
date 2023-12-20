package com.example.converterapplab1.converters;

import java.util.HashMap;
import java.util.Map;

public class LengthConverter {
    private static final String METER="METER";
    private static final String CENTIMETER="CENTIMETER";
    private static final String YARD="YARD";
    private static final String FOOT="FOOT";
    private static final String KILOMETER="KILOMETER";
    private static final String INCH="INCH";
    private static final String MILE="MILE";


    public String convert(double value, String fromValue, String toValue) {
        double result = 0.0;
        switch (fromValue) {
            case METER:
                switch (toValue) {
                    case CENTIMETER:
                        result = value * 100;
                        break;
                    case FOOT:
                        result = value * 3.281;
                        break;
                    case KILOMETER:
                        result = value / 1000;
                        break;
                    case MILE:
                        result = value / 1609;
                        break;
                    case YARD:
                        result = value * 1.094;
                        break;
                    case INCH:
                        result = value * 39.37;
                        break;
                    default:
                        result=value;
                        break;
                }
                break;
            case KILOMETER:
                switch (toValue) {
                    case CENTIMETER:
                        result = value * 100000;
                        break;
                    case FOOT:
                        result = value * 3280.84;
                        break;
                    case MILE:
                        result = value / 1.609344;
                        break;
                    case YARD:
                        result = value * 1093.61;
                        break;
                    case INCH:
                        result = value * 39370;
                        break;
                    case METER:
                        result = value * 1000;
                        break;
                    default:
                        result=value;
                        break;
                }
                break;
            case CENTIMETER:
                switch (toValue) {
                    case FOOT:
                        result = value / 30.48;
                        break;
                    case MILE:
                        result = value / 160934.4;
                        break;
                    case YARD:
                        result = value / 91.44;
                        break;
                    case INCH:
                        result = value / 2.54;
                        break;
                    case METER:
                        result = value / 100;
                        break;
                    case KILOMETER:
                        result = value / 100000;
                        break;
                    default:
                        result=value;
                        break;
                }
                break;
            case INCH:
                switch (toValue) {
                    case FOOT:
                        result = value / 12;
                        break;
                    case MILE:
                        result = value / 63360;
                        break;
                    case YARD:
                        result = value / 36;
                        break;
                    case CENTIMETER:
                        result = value * 2.54;
                        break;
                    case METER:
                        result = value / 39.37;
                        break;
                    case KILOMETER:
                        result = value / 39370;
                        break;
                    default:
                        result=value;
                        break;
                }
                break;
            case YARD:
                switch (toValue) {
                    case FOOT:
                        result = value * 3;
                        break;
                    case MILE:
                        result = value / 1760;
                        break;
                    case CENTIMETER:
                        result = value * 91.44;
                        break;
                    case METER:
                        result = value / 1.094;
                        break;
                    case KILOMETER:
                        result = value / 1094;
                        break;
                    case INCH:
                        result = value * 36;
                        break;
                    default:
                        result=value;
                        break;
                }
                break;
            case FOOT:
                switch (toValue) {
                    case MILE:
                        result = value / 5280;
                        break;
                    case CENTIMETER:
                        result = value * 30.48;
                        break;
                    case INCH:
                        result = value * 12;
                        break;
                    case METER:
                        result = value / 3.281;
                        break;
                    case YARD:
                        result = value / 3;
                        break;
                    case KILOMETER:
                        result = value / 3281;
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
