package com.example.greeting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.TextView;





public class MainActivity extends AppCompatActivity {
    TextView gt;
    Button gb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gb=findViewById(R.id.gb);
        final TextView gt=findViewById(R.id.gt);
        gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gt.setText("hello,Welcome!!!!");

            }
        });
    }
}
