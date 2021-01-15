package com.example.converter;

import java.util.*;
public class currency {
    //    private float inr = (float)73.3;
//    private float usd = 1;
//    private float eur = (float)0.82;
//    private float jpy = (float)103.94;
//    private float gbp = (float)0.74;
//    private float aud = (float)1.29;
//    private float mxn = (float)19.96;
//    private float kwd = (float)0.30;
//    private float sgd = (float)1.32;
//    private float myr = (float)4.04;
//    private float aed = (float)3.67;
    Hashtable<String, String> exchange = new Hashtable<String, String>();
    String ConFrom = "";
    String ConTo = "";
    currency()
    {
        exchange.put("INR", "73.3");
        exchange.put("USD", "1");
        exchange.put("EUR", "0.82");
        exchange.put("JPY", "103.94");
        exchange.put("GBP", "0.74");
        exchange.put("AUD", "1.29");
        exchange.put("MXN", "19.96");
        exchange.put("KWD", "0.30");
        exchange.put("SGD", "1.32");
        exchange.put("MYR", "4.04");
        exchange.put("AED", "3.67");
    }
//    currency(float i,float u,float e,float j,float g,float a,float m,float k,float s,float my,float ae)
//    {
//        inr = (float)i;
//        usd = (float)u;
//        eur = (float)e;
//        jpy = (float)j;
//        gbp = (float)g;
//        aud = (float)a;
//        mxn = (float)m;
//        kwd = (float)k;
//        sgd = (float)s;
//        myr = (float)my;
//        aed = (float)ae;
//    }

    double convert(String Amt,String ConFrom,String ConTo)
    {
//        System.out.println(ConFrom+" con from "+ConTo);
        final double v = (double) Double.parseDouble(Amt) * ((1 / Double.parseDouble(exchange.get(ConFrom))) * (Double.parseDouble(exchange.get(ConTo))));
//        System.out.println(ConFrom+" con from "+ConTo+" value :"+v+"  amt :"+Double.parseDouble(Amt));
        return v;
    }

//    public static void main(String []args) {
//        System.out.println("Hello World"); // prints Hello World
//    }
}
