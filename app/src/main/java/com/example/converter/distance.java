package com.example.converter;

public class distance {
    double convert(String Amt,String ConFrom,String ConTo) throws NumberFormatException{
        double value = Double.parseDouble(Amt);
        System.out.println(value);
        System.out.println(Amt);
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
                meter= meter * 39.37;
                break;
            case "feet":
                meter= meter * 3.281;
                break;
            case "yard":
                meter= meter * 1.094;
                break;
            case "mile":
                meter= meter/ 1609;
                break;
            case "millimeter":
                meter= meter * 1000;
                break;
            case "centimeter":
                meter= meter  * 100;
                break;
            case "meter":
                //meter;
                break;
            case "kilometer":
                meter= meter / 1000;
                break;
        }
        System.out.println(meter);
        return meter;
    }
}
