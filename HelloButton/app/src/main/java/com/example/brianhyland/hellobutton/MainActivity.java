package com.example.brianhyland.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mMessageTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // this method is called when the app launches
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //code you add goes after setContentView
    }
}
