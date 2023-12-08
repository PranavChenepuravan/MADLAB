package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    RadioButton male,female,others;
    CheckBox chk;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        male=findViewById(R.id.rbmale);
        female=findViewById(R.id.rbfemale);
        others=findViewById(R.id.rbothers);
        chk=findViewById(R.id.checkBox);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = e1.getText().toString().trim();
                String password = e2.getText().toString().trim();

                if(username.isEmpty()){
                    e1.setError("Enter username");
                }
                if(password.isEmpty()){
                    e2.setError("Enter password");
                }
                if(!chk.isChecked()){
                    Toast.makeText(MainActivity.this,"Check T&C",Toast.LENGTH_SHORT).show();
                }

                if(male.isChecked() || female.isChecked() || others.isChecked()){

                }
                else {
                    Toast.makeText(MainActivity.this,"Check Gender",Toast.LENGTH_SHORT).show();
                    return;

                }
                Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
