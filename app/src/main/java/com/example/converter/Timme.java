package com.example.converter;

import android.widget.Switch;

public class Timme {
    double convert(String Amt,String ConFrom,String ConTo)
    {
        double value = Double.parseDouble(Amt);
        double seconds = 0;
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
                    return seconds;
                case "Minutes":
                    return seconds/60;
//                    break;
                case "Hour":
                    return seconds/3600;
//                    break;
                case "Day":
                    return seconds/86400;
//                    break;
                case "Week":
                    return seconds/604800;
//                    break;
                case "Month":
                    return seconds/2628000;
//                    break;
                case "Year":
                    return seconds/3154000;
//                    break;
                default:
                    break;
            }
        return 0.0;
    }

}
