package com.example.converter;

public class distance {
    double convert(String Amt,String ConFrom,String ConTo) {
        double value = Double.parseDouble(Amt);
        double meter = 0;
        switch (ConFrom)
        {
            case "inch":
                meter = value / 39.37;
                break;
            case "feet":
                meter = value / 3.281;
                break;
            case "yard":
                meter = value / 1.094;
                break;
            case "mile":
                meter = value * 1609;
                break;
            case "millimeter":
                meter = value / 1000;
                break;
            case "centimeter":
                meter = value / 100;
                break;
            case "meter":
                meter = value;
                break;
            case "kilometer":
                meter = value * 1000;
                break;
        }
//        var inch = meter * 39.37;
//        var foot = meter * 3.281;
//        var yard = meter * 1.094;
//        var mile = meter / 1609;
//        var mm = meter * 1000;
//        var cm = meter * 100;
//        var km = meter / 1000;
        switch (ConTo)
        {
            case "inch":
                return meter * 39.37;
            case "feet":
                return meter * 3.281;
            case "yard":
                return meter * 1.094;
            case "mile":
                return meter/ 1609;
            case "millimeter":
                return meter * 1000;
            case "centimeter":
                return meter  * 100;
            case "meter":
                return meter;
            case "kilometer":
                return meter / 1000;
            default:
                return 0;
        }
    }
}
