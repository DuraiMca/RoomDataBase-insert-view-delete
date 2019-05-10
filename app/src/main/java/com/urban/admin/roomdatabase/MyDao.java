package com.urban.admin.roomdatabase;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MyDao {
    @Insert
    public void adduser(User user);
   @Query("select * from users")
    public List<User>getusers();
   @Delete
   public void deleteuser(User user);

  @Update
   public  void updatedata(User user);
}
