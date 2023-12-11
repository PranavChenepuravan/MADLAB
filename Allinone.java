MainActiviy.java
-----------------
package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname,pwd;
    RadioButton ml,fl,ot;
    CheckBox ch;
    Button lgn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=findViewById(R.id.user);
        pwd=findViewById(R.id.pass);
        ml=findViewById(R.id.rbmale);
        fl=findViewById(R.id.rbfemale);
        ot=findViewById(R.id.rbother);
        ch=findViewById(R.id.checkBox2);
        lgn=findViewById(R.id.button3);

        lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=uname.getText().toString().trim();
                String password=pwd.getText().toString().trim();
                if(username.isEmpty()){
                    uname.setError("Fill The User name ");
                    return;
                }
                if(password.isEmpty()){
                    pwd.setError("Fill the password");
                    return;
                }
                if(ml.isChecked()||fl.isChecked()||ot.isChecked()){

                }
                else{
                    Toast.makeText(getApplicationContext(),"Select Gender",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!ch.isChecked()){
                    Toast.makeText(getApplicationContext(),"Check the box",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(username.equals("abilash")&&password.equals("007")){
                    Toast.makeText(getApplicationContext(),"Nice",Toast.LENGTH_SHORT).show();
                    Intent next = new Intent(MainActivity.this,Between.class);
                    startActivity(next);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Wrong Username or Password",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }
}


Between.java
-------------

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Between extends AppCompatActivity {

    Button fb,sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_between);
        fb=findViewById(R.id.yt);
        sb=findViewById(R.id.calcu);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent you = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch"));
                startActivity(you);
                Toast.makeText(getApplicationContext(),"Wow Youtube ",Toast.LENGTH_SHORT).show();
            }
        });

        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cal = new Intent(getApplicationContext(),Calcu3.class);
                startActivity(cal);
            }
        });
    }
}

Calcu3.java
------------
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calcu3 extends AppCompatActivity {

    EditText e1,e2;
    Button ad,su,mu,di;
    TextView an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu3);
        e1=findViewById(R.id.edfn);
        e2=findViewById(R.id.edsn);
        ad=findViewById(R.id.btadd);
        su=findViewById(R.id.btsub);
        mu=findViewById(R.id.btmul);
        di=findViewById(R.id.btdiv);
        an=findViewById(R.id.textView7);

        Toast.makeText(getApplicationContext(),"Wow Calculator",Toast.LENGTH_SHORT).show();

        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(e1.getText().toString());
                int b = Integer.parseInt(e2.getText().toString());
                int ans = a + b;
                an.setText(String.valueOf(ans));
            }
        });
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(e1.getText().toString());
                int b = Integer.parseInt(e2.getText().toString());
                int ans = a - b;
                an.setText(String.valueOf(ans));
            }
        });
        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(e1.getText().toString());
                int b = Integer.parseInt(e2.getText().toString());
                int ans = a * b;
                an.setText(String.valueOf(ans));

            }
        });

        di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(e1.getText().toString());
                int b = Integer.parseInt(e2.getText().toString());
                int ans = a / b;
                an.setText(String.valueOf(ans));
            }
        });
    }
}
