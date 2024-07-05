package com.sunbeaminfo.practise1;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class} ,   version = 1)
public abstract class AppDatabase extends RoomDatabase{

    // Add a abstract method that will return you object of your Dao interface

    public abstract StudentDao studentDao();

    // method that will return an object of the Databases

    public static AppDatabase getInstance(Context context)
    {
        return Room.databaseBuilder(context, AppDatabase.class,"dmc_db")
                .allowMainThreadQueries()
                .build();
    }
}
