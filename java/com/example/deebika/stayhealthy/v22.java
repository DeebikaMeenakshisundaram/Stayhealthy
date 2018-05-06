package com.example.deebika.stayhealthy;
import android.support.v7.app.AppCompatActivity;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;

        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;
public class v22 extends AppCompatActivity {
    private Button buttonSum,b13,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v22);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        b13=(Button)findViewById(R.id.b13);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i13 = new Intent(getApplicationContext(), v23.class);
                startActivity(i13);
            }
        });
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i14 = new Intent(getApplicationContext(), v24.class);
                startActivity(i14);
            }
        });
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i15 = new Intent(getApplicationContext(), v25.class);
                startActivity(i15);
            }
        });

    }
}


