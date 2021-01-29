package com.example.converter;

import android.widget.Switch;

public class Timme {
    double convert(String Amt,String ConFrom,String ConTo) throws NumberFormatException
    {
        double value = Double.parseDouble(Amt);
        double seconds = 0;
        double val=0;
        switch(ConFrom){
            case "Seconds":
                seconds = value;
                break;
            case "Minutes":
                seconds = value * 60;
                break;
            case "Hour":
                seconds = value * 3600;
                break;
            case "Day":
                seconds = value * 86400;
                break;
            case "Week":
                seconds = value * 604800;
                break;
            case "Month":
                seconds = value * 2628000;
                break;
            case "Year":
                seconds = value * 3154000;
                break;
            default:
                break;
            }
//        var min = seconds / 60;
//        var hr = seconds / 3600;
//        var day = seconds / 86400;
//        var week = seconds / 604800;
//        var month = seconds / 2628000;
//        var year = seconds / 3154000;
            switch (ConTo){
                case "Seconds":
                    val= seconds;
                    break;
                case "Minutes":
                    val= seconds/60;
                    break;
                case "Hour":
                    val =seconds/3600;
                    break;
                case "Day":
                    val = seconds/86400;
                    break;
                case "Week":
                    val = seconds/604800;
                    break;
                case "Month":
                    val = seconds/2628000;
                    break;
                case "Year":
                    val=  seconds/3154000;
                    break;
                default:
                    break;
            }
        System.out.println(val);
        return val;
    }

}
