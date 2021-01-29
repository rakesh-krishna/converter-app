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

    String convert(String amt, String ConFrom, String ConTO) throws NumberFormatException{
//        "Binary", "Quinary", "Octal", "Decimal" ,"Hexadecimal"
        int value = Integer.parseInt(amt);
        String val="";
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
                val= String.valueOf(seconds);
                break;
            case "Hexadecimal":
                val= Integer.toHexString(seconds);
                break;
            case "Octal":
                val = Integer.toOctalString(seconds);
                break;
            case "Binary":
                val = Integer.toBinaryString(seconds);
                break;
            case "Quinary":
                val = Integer.toString(Integer.parseInt(String.valueOf(seconds), 10), 5);
                break;
            default:
                break;
        }
        System.out.println(val);
        return val;
}
}
