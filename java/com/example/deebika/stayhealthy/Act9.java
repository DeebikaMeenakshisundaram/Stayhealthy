package com.example.deebika.stayhealthy;

/**
 * Created by Deebika on 06-05-2018.
 */
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Act9 extends AppCompatActivity {

    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act9);

        e = (EditText)findViewById(R.id.comment);
        Button b = (Button)findViewById(R.id.submit);
        final Db2 dd1=new Db2(this);

        b.setOnClickListener(new OnClickListener()  {

            @Override
            public void onClick(View v) {
                Intent i = getIntent();
                Bundle b = i.getExtras();
                dd1.open();
                dd1.insert(e.getText().toString());

                Toast.makeText(getApplicationContext(), "Done!", Toast.LENGTH_SHORT).show();
                Intent reset_intent = new Intent(getApplicationContext(), activity8.class);
                reset_intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplicationContext().startActivity(reset_intent);
            }

        });
    }
}
class Db2 {
    private static final String DB_Name = "Deb.db";
    private static final int version = 1;
    private static final String crea = "CREATE TABLE IF NOT EXISTS comment1(comment VARCHAR(50));";
    private SQLiteDatabase db;
    private final Context c;
    private MyDBHelper dbh;

    public Db2(Context co) {
        c = co;
        dbh = new MyDBHelper(c, DB_Name, null, version);
    }

    public Db2 open() throws SQLException {
        db = dbh.getWritableDatabase();
        return this;
    }

    public void close() {
        db.close();
    }

    public void insert(String comm) {
        ContentValues value = new ContentValues();
        value.put("comment", comm);
        db.insert("comment1", null, value);
    }


    private static class MyDBHelper extends SQLiteOpenHelper {
        public MyDBHelper(Context con, String name, SQLiteDatabase.CursorFactory cf, int ver) {
            super(con, name, cf, ver);
        }

        public void onCreate(SQLiteDatabase sd) {
            sd.execSQL(crea);
        }

        public void onUpgrade(SQLiteDatabase sd, int ov, int nv) {

        }
    }

}