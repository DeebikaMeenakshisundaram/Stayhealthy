package com.example.deebika.stayhealthy;
        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.View.OnClickListener;

        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;
public class v18 extends AppCompatActivity{
    private Button buttonSum,b11,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v18);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        b11=(Button)findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i44 = new Intent(getApplicationContext(), v19.class);
                startActivity(i44);
            }
        });
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i45 = new Intent(getApplicationContext(), v20.class);
                startActivity(i45);
            }
        });
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i46 = new Intent(getApplicationContext(), v21.class);
                startActivity(i46);
            }
        });

    }
}


