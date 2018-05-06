package com.example.deebika.stayhealthy;

/**
 * Created by Deebika on 03-05-2018.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Deebika on 28-04-2018.
 */
/**
 * Created by Deebika on 28-04-2018.
 */
public class Db {
    private static final String DB_Name="Deb.db";
    private static final int version=1;
    private static final String crea="CREATE TABLE IF NOT EXISTS reg6(name VARCHAR,email VARCHAR,password VARCHAR,confp VARCHAR,dob DATE);";
    private SQLiteDatabase db;
    private final Context c;
    private MyDBHelper dbh;

    public Db(Context co){
        c=co;
        dbh=new MyDBHelper(c,DB_Name,null,version);
    }
    public Db open() throws SQLException {
        db=dbh.getWritableDatabase();
        return this;
    }
    public void close(){
        db.close();
    }
    public void insert(String name,String email,String psw,String cpsw,String dob){
        ContentValues value=new ContentValues();
        value.put("name", name);
        value.put("email", email);
        value.put("password", psw);
        value.put("confp", cpsw);
        value.put("dob", dob);
        db.insert("reg6", null, value);
    }
    public boolean Login(String username, String password) throws SQLException
    {
        SQLiteDatabase db1;
        SQLiteOpenHelper oh;
        oh=new MyDBHelper(c,DB_Name,null,version);
        db1 = oh.getReadableDatabase();
        Cursor mCursor = db1.rawQuery("SELECT * FROM " + "reg6" + " WHERE name=? AND password=?", new String[]{username,password});
        if (mCursor != null) {
            if(mCursor.getCount() > 0)
            {
                return true;
            }
        }
        return false;
    }
    private static class MyDBHelper extends SQLiteOpenHelper {
        public MyDBHelper(Context con,String name,SQLiteDatabase.CursorFactory cf,int ver){
            super(con,name,cf,ver);
        }
        public void onCreate(SQLiteDatabase sd){
            sd.execSQL(crea);
        }
        public void onUpgrade(SQLiteDatabase sd,int ov,int nv){

        }
    }

}

