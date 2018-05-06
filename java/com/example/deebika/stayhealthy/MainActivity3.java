package com.example.deebika.stayhealthy;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.deebika.stayhealthy.Db;
import com.example.deebika.stayhealthy.R;

public class MainActivity3 extends AppCompatActivity {
    Button sub;
    EditText et,et1,et2,et3,et4;
    String name,email,psw,cpsw,dob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity3);
    }
    public void success(View v)
    {
        et = (EditText)findViewById(R.id.e3);
        et1 = (EditText)findViewById(R.id.e31);
        et2 = (EditText)findViewById(R.id.e4);
        et3 = (EditText)findViewById(R.id.e5);
        et4 = (EditText)findViewById(R.id.e6);
        name = et.getText().toString();
        email = et1.getText().toString();
        psw = et2.getText().toString();
        cpsw = et3.getText().toString();
        dob = et4.getText().toString();
        final Db d1= new Db(this);
        d1.open();

        if(!(name.equals("")) && !(email.equals("")) && !(psw.equals("")) && !(cpsw.equals("")) && !(dob.equals("")) ){
            if(psw.equals(cpsw)){

                d1.insert(name,email,psw,cpsw,dob);
                final AlertDialog show = new AlertDialog.Builder(this)
                        .setTitle("Success")
                        .setMessage("Registered Successfully")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                String str = et.getText().toString()+"  WELCOME";
                                Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
                                msg.show();
                            }
                        })
                        .show();}}
        else{
            final AlertDialog show = new AlertDialog.Builder(this)
                    .setTitle("ERROR")
                    .setMessage("ERROR")
                    .show();
        }
        d1.close();
    }
    public void ex(View a)
    {
        final AlertDialog show = new AlertDialog.Builder(this)
                .setTitle("Cancelled")
                .setMessage("Cancelled")
                .show();
    }

}
