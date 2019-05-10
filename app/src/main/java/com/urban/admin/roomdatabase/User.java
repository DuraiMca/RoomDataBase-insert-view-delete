package com.urban.admin.roomdatabase;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity (tableName = "users")
public class User {
    public void setId(int id) {
        this.id = id;
    }

    @PrimaryKey(autoGenerate = true)

    private  int id;
    @ColumnInfo(name = "username")
    String name;

    public User(String name, String age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    @ColumnInfo(name = "userage")
    String age;

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @ColumnInfo(name = "userdegree")

    String degree;

}
