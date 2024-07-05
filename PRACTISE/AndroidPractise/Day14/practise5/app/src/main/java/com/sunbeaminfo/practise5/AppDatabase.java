package com.sunbeaminfo.practise5;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Employee.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract EmployeeDao employeeDao();

    public static AppDatabase getInstance(Context context)
    {
        return Room.databaseBuilder(context, AppDatabase.class,"dmc_db")
                .allowMainThreadQueries()
                .build();
    }


}
