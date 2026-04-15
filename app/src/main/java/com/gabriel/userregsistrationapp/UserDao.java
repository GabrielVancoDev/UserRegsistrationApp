package com.gabriel.userregsistrationapp;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Delete;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insert(User user);

    @Query("SELECT * FROM User")
    List<User> getAllUsers();

    @Query("SELECT * FROM User WHERE id = :id")
    User getUserById(int id);

    @Query("DELETE FROM User")
    void deleteAll();

    @Delete
    void delete(User user);

    @Update
    void update(User user);
}