package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ed1=(EditText) findViewById(R.id.fir);
        EditText ed2=(EditText) findViewById(R.id.sec);
        Button b1=(Button) findViewById(R.id.bu1);
        Button b2=(Button) findViewById(R.id.bu2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t2=(TextView) findViewById(R.id.textView);
                int n1 =Integer.parseInt(ed1.getText().toString());
                int n2=Integer.parseInt(ed2.getText().toString());
                int result =n1+n2;
                t2.setText("The value" +result);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t2=(TextView) findViewById(R.id.textView);
                int n1 =Integer.parseInt(ed1.getText().toString());
                int n2=Integer.parseInt(ed2.getText().toString());
                int result =n1-n2;
                t2.setText("the value" +result);
            }
        });



    }
}