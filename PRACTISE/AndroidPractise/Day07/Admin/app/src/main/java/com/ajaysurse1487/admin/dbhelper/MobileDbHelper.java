package com.ajaysurse1487.admin.dbhelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.ajaysurse1487.admin.entity.Mobile;

import java.util.ArrayList;
import java.util.List;

public class MobileDbHelper extends SQLiteOpenHelper {
    private static final String TABLENAME="mobile";

    public MobileDbHelper(@Nullable Context context) {
        super(context,"dmc_db",null,1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql= "CREATE TABLE "+ TABLENAME +"(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, price DOUBLE, description TEXT)";
        db.execSQL(sql);
    }


    public List<Mobile> getAllMobile()
    {
        SQLiteDatabase db= getReadableDatabase();
        Cursor cursor=db.query(TABLENAME,null,null,null,null,null,null);
        List<Mobile> mobileList= new ArrayList<>();
        while(cursor.moveToNext())
        {
            Mobile mobile= new Mobile();
            mobile.setId(cursor.getInt(0));
            mobile.setName(cursor.getString(1));
            mobile.setPrice(cursor.getDouble(2));
            mobile.setDesc(cursor.getString(3));
            mobileList.add(mobile);

        }
        return mobileList;
    }

    public void insertMobile(Mobile mobile)
    {
        SQLiteDatabase db= getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("name",mobile.getName());
        values.put("price",mobile.getPrice());
        values.put("description",mobile.getDesc());
        db.insert(TABLENAME,null,values);
    }

    public void deleteMobile(Mobile mobile)
    {
        SQLiteDatabase db= getWritableDatabase();
        db.delete(TABLENAME,"id=?",new String[]{""+mobile.getId()});
    }

    public void updateMobile(Mobile mobile)
    {
        SQLiteDatabase db= getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put("price",mobile.getPrice());
        values.put("description",mobile.getDesc());
        db.update(TABLENAME,values,"id=?",new String[]{""+mobile.getId()});

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
