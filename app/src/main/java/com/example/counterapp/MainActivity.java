package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcome;
    TextView counter_text;
    Button butn;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butn=findViewById(R.id.butn);
        counter_text=findViewById(R.id.counter_text);
        welcome=findViewById(R.id.welcome);

        //Adding functionalities
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counter_text.setText(""+increaseCounter());
            }
        });
    }

    public  int increaseCounter(){
        return ++counter;
    }


}