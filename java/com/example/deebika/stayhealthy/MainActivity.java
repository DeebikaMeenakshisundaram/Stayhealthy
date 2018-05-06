package com.example.deebika.stayhealthy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b3;
    Button b2;
    Button b4;
    Button b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void reg(View v)
    {
        b3 = (Button)v;
        Intent login=new Intent(getApplicationContext(), Mainactivity2.class);
        startActivity(login);
    }
    public void reg3(View v)
    {
        b2 = (Button)v;
        startActivity(new Intent(getApplicationContext(), MainActivity3.class));
    }

    public void about(View v)
    {
        b4 = (Button)v;
        startActivity(new Intent(getApplicationContext(),Mainactivity4.class));
    }
    public void facts(View v)
    {
        b5 = (Button)v;
        Intent i=new Intent(getApplicationContext(),Mainactivity5.class);
        startActivity(i);
    }
    public void ac1(View v)
    {
        b1 = (Button)v;
        Intent i1=new Intent(getApplicationContext(),Mainactivity6.class);
        startActivity(i1);
    }

}
