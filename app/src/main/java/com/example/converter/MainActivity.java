package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.util.*;
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener ,AdapterView.OnClickListener{

    String[] country = { "INR", "USD", "EUR", "JPY", "GBP" , "AUD", "MXN" ,"KWD", "SGD" ,"MYR","AED"};
    String[] conType = { "Currency" ,"Distance", "Temperature","Time","Number"};
    String[] dist = {"inch", "feet", "yard", "mile", "millimetre", "centimetre", "meter" , "kilometer"};
    String[] temps = {"Celsius", "Fahrenheit" ,"Kelvin"};
    String[] times = {"Seconds", "Minutes", "Hour", "Day", "Week", "Month" ,"Year"};
    String[] nubs = {"Binary", "Quinary", "Octal", "Decimal" ,"Hexadecimal"};
    Boolean First = Boolean.TRUE;
//    ArrayAdapter spin_dis = new ArrayAdapter(this,android.R.layout.simple_spinner_item,dist);
//    ArrayAdapter spin_temps = new ArrayAdapter(this,android.R.layout.simple_spinner_item,temps);
//    ArrayAdapter spin_nubs = new ArrayAdapter(this,android.R.layout.simple_spinner_item,nubs);
//    ArrayAdapter spin_times = new ArrayAdapter(this,android.R.layout.simple_spinner_item,times);
//    ArrayAdapter spin_coun = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
//    Button buton = (Button) findViewById(R.id.button);
//    Hashtable<String,Object> typs = new Hashtable<String, Object>();

//    MainActivity()
//    {
//        currency a = new currency();
//        typs.put("Currency",a);
//
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView) findViewById(R.id.textView);
        TextView input = (TextView) findViewById(R.id.textView3);
        Button buton = (Button) findViewById(R.id.button);
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        Spinner spin2 = (Spinner) findViewById(R.id.spinner3);
        Spinner spin3 = (Spinner) findViewById(R.id.spinner4);
        currency cur = new currency();
        System.out.println("Great");
//        typs.put("Currency",cur);
//        typs.put("Time",tim);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,conType);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
        aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        spin2.setAdapter(aa);
        spin3.setAdapter(aa);

    ArrayAdapter spin_dis = new ArrayAdapter(this,android.R.layout.simple_spinner_item,dist);
    ArrayAdapter spin_temps = new ArrayAdapter(this,android.R.layout.simple_spinner_item,temps);
    ArrayAdapter spin_nubs = new ArrayAdapter(this,android.R.layout.simple_spinner_item,nubs);
    ArrayAdapter spin_times = new ArrayAdapter(this,android.R.layout.simple_spinner_item,times);
    ArrayAdapter spin_coun = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        buton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // Do something in response to button click
//            System.out.println("This is in response for the button click");
            String type = spin.getSelectedItem().toString();
            String From = spin2.getSelectedItem().toString();
            String To = spin3.getSelectedItem().toString();
            switch(type) {
                case "Currency":
                    String val = new String();
                    val = Double.toString((cur.convert(txt.getText().toString(),From,To)));
                    input.setText(val);
                    break;
                case "Time":
//                     code block
                     Timme tim = new Timme();
                     val = Double.toString((tim.convert(txt.getText().toString(),From,To)));
                     input.setText(val);
//                    System.out.println("Time selected");
                    break;
                case "Distance":
                    distance dis = new distance();
                    val = Double.toString((dis.convert(txt.getText().toString(),From,To)));
                    input.setText(val);
                case "Number":
                    numberCon nn = new numberCon();
                    val = nn.convert(txt.getText().toString(),From,To);
                    input.setText(val);
                case "Temperature":
                    temperature tt = new temperature();
                    val = String.valueOf(tt.convert(txt.getText().toString(),From,To));
                    input.setText(val);
                default:
                    // code block
            }
//            System.out.println("type :"+type);
        }
    });

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                System.out.println("on seledt");
                if(First==Boolean.TRUE){
                    First=Boolean.FALSE;
                    System.out.println("on seledt");
                }
                else
                {
                    String selectedItemText = (String) parentView.getItemAtPosition(position);
                    switch(selectedItemText)
                    {
                        case "Currency":
                            spin2.setAdapter(spin_coun);
                            spin3.setAdapter(spin_coun);
                            break;
                        case "Time":
                            spin2.setAdapter(spin_times);
                            spin3.setAdapter(spin_times);
                            break;
                        case "Temperature":
                            spin2.setAdapter(spin_temps);
                            spin3.setAdapter(spin_temps);
                            break;
                        case "Distance":
                            spin2.setAdapter(spin_dis);
                            spin3.setAdapter(spin_dis);
                            break;
                        case "Number":
                            spin2.setAdapter(spin_nubs);
                            spin3.setAdapter(spin_nubs);
                            break;
                        default:
                    }
                    System.out.println("second");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        });
//        aa = new ArrayAdapter(this,android.R.)
    }



//        buton.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View v) {
//            // Do something in response to button click
//        }
//    });
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //for now we have nothing to do  here
    }

    @Override
    public void onClick(View v) {
        //
    }
}