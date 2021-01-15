package com.example.converter;

import java.util.Hashtable;

public class numberCon {
    Hashtable<String, String> exchange = new Hashtable<String, String>();

    numberCon() {
        exchange.put("Decimal", "10");
        exchange.put("Quinary", "5");
        exchange.put("Octal", "8");
        exchange.put("Binary", "2");
        exchange.put("Hexadecimal", "16");
    }

    String convert(String amt, String ConFrom, String ConTO) {
//        "Binary", "Quinary", "Octal", "Decimal" ,"Hexadecimal"
        int value = Integer.parseInt(amt);
        int seconds = 0;
        switch (ConFrom) {
            case "Decimal":
                seconds = value;
                break;
            case "Hexadecimal":
                seconds = Integer.parseInt(amt, 16);
                break;
            case "Octal":
                seconds = Integer.parseInt(amt, 8);
                break;
            case "Binary":
                seconds = Integer.parseInt(amt, 2);
                break;
            case "Quinary":
                seconds = Integer.parseInt(amt, 5);
                break;
            default:
                break;
        }
        switch (ConTO) {
            case "Decimal":
                return String.valueOf(seconds);
            case "Hexadecimal":
                return Integer.toHexString(seconds);
            case "Octal":
                return Integer.toOctalString(seconds);
            case "Binary":
                return Integer.toBinaryString(seconds);
            case "Quinary":
                return Integer.toString(Integer.parseInt(String.valueOf(seconds), 10), 5);
            default:
                break;
        }
        return "";
}
}
