package com.example.project2.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.floralhaven.dao.UsersDAO;
import com.example.floralhaven.entities.Users;

@Database(entities = {Users.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static final String DB_NAME = "FloralHavenDB";
    private static AppDatabase instance;

    public abstract UsersDAO usersDAO();

    public static AppDatabase getDBInstance(Context context) {
        if (instance == null) { instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, AppDatabase.DB_NAME).allowMainThreadQueries().build(); }
        return instance;
    }
}
