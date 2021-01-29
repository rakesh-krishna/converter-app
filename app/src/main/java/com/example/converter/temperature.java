package com.example.converter;

public class temperature {
    double convert(String Amt,String ConFrom,String ConTo) throws NumberFormatException{
        double value = Double.parseDouble(Amt);
        double temp = 0;
        double val = 0;
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
                val = value;
                break;
            case "Fahrenheit":
                val =  (value*9/5)  + 32;
                break;
            case "Kelvin":
                val = value + 273.15 ;
                break;
            default:
                break;
        }
        return val;
    }
}
