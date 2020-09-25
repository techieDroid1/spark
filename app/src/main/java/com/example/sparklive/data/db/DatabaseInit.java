package com.example.sparklive.data.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.sparklive.data.db.dao.DataDao;
import com.example.sparklive.data.db.entities.DataEntity;

@Database(entities = DataEntity.class, exportSchema = false, version = 4)
public abstract class DatabaseInit extends RoomDatabase {

    private static final String DB_NAME = "messages";
    private static DatabaseInit instance;

    public static synchronized DatabaseInit getInstance(Context context) {
        if (instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(), DatabaseInit.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

    public abstract DataDao dataDao();
}
