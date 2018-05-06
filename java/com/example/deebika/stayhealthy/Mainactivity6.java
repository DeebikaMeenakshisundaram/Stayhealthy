package com.example.deebika.stayhealthy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mainactivity6 extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity6);
    }
    public void ac(View v)
    {
        b=(Button)v;
        Intent i1=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i1);
    }
}
