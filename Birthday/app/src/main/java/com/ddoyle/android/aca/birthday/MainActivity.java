package com.ddoyle.android.aca.birthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    String birthday;

    birthday = "04/29/2016";

    String month = birthday.substring(0,1);

    String day = birthday.substring(4, 5);
    String year = birthday.substring(7,10);


    System.out.println("Month " + month);
    System.out.println("Day " + day);
    System.out.println("Year " + year);



    }

}
