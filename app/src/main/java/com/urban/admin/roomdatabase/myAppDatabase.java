package com.urban.admin.roomdatabase;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {User.class},version = 1)
public abstract class myAppDatabase extends RoomDatabase {
    public abstract MyDao dao();

}
