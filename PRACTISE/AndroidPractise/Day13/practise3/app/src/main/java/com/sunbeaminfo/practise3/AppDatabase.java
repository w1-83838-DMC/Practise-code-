package com.sunbeaminfo.practise3;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

        public abstract StudentDao studentDao();


        public static AppDatabase getInstance(Context context)
        {
            return Room.databaseBuilder(context, AppDatabase.class,"dmc-db")
                    .allowMainThreadQueries()
                    .build();

        }

}
