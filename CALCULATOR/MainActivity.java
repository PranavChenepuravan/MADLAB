package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2,ans;
    Button addbtn,subbtn,mulbtn,divbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        ans=findViewById(R.id.res);
        addbtn=findViewById(R.id.b1);
        subbtn=findViewById(R.id.b2);
        mulbtn=findViewById(R.id.b3);
        divbtn=findViewById(R.id.b4);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(n1.getText().toString());
                int y=Integer.parseInt(n2.getText().toString());
                int add=x+y;
                ans.setText(String.valueOf(add));
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(n1.getText().toString());
                int y=Integer.parseInt(n2.getText().toString());
                int sub=x-y;
                ans.setText(String.valueOf(sub));
            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(n1.getText().toString());
                int y=Integer.parseInt(n2.getText().toString());
                int mul=x*y;
                ans.setText(String.valueOf(mul));
            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=Integer.parseInt(n1.getText().toString());
                int y=Integer.parseInt(n2.getText().toString());
                int div=x/y;
                ans.setText(String.valueOf(div));
            }
        });



    }
}
