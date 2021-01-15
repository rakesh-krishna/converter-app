package com.example.converter;

public class temperature {
    double convert(String Amt,String ConFrom,String ConTo) {
        double value = Double.parseDouble(Amt);
        double temp = 0;
//        Celsius", "Fahrenheit" ,"Kelvin"
        switch (ConFrom)
        {
            case "Celsius":
            temp = value;
            break;
            case "Fahrenheit":
                temp = (5/9) * (value - 32);
                break;
            case "Kelvin":
                temp = value - 273.15;
                break;
            default:
                break;
        }
        switch (ConTo)
        {
            case "Celsius":
                return value;
//                break;
            case "Fahrenheit":
                return  (value*9/5)  + 32;
            case "Kelvin":
                return value + 273.15 ;
            default:
                break;
        }
        return 0;
    }
}
