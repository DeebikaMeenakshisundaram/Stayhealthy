package com.example.deebika.stayhealthy;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Mainactivity2 extends AppCompatActivity {
   EditText l,l1;
    Button lb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity2);
        l=(EditText)findViewById(R.id.n);
        l1=(EditText)findViewById(R.id.n1);

        final Db db2= new Db(this);
        //if(db2.Login(s1,s2)){
        findViewById(R.id.lb).setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String s1=l.getText().toString();
                String s2=l1.getText().toString();
                if(db2.Login(s1,s2)){
                startActivity(new Intent(getApplicationContext(),activity8.class));}
                else{
                    Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_SHORT).show();
                }
            }
        });}


    }
   // public void msg(View v)
    //{

     //   l = (EditText)findViewById(R.id.n);
       // l1 = (EditText)findViewById(R.id.n1);

       // final Db d2= new Db(this);
        //String s1=l.getText().toString();
       // String s2=l1.getText().toString();



       // boolean b = d2.Login(s1,s2);
        //String s3=l.getText().toString();
        /*if(b == true){
            final AlertDialog a=new AlertDialog.Builder(this)
                    .setMessage("WELCOME "+s3)
                    .show();}
        else{
            final AlertDialog a1=new AlertDialog.Builder(this)
                    .setMessage("NOT REGISTERED")
                    .show();
        }*/



    //}
