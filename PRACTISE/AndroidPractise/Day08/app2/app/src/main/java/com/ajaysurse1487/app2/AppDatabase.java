package com.ajaysurse1487.app2;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class},version = 1)
public  abstract class AppDatabase extends RoomDatabase {

    // add a abstract method that will return you object of your Dao Interface
    public abstract StudentDao studentDao();

    public  static AppDatabase getInstance(Context context)
    {
        return Room.databaseBuilder(context, AppDatabase.class,"dmc_db")
                .allowMainThreadQueries()
                .build();
    }


}
