package com.example.project2.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.project2.entities.Users;

import java.util.List;

@Dao
public interface UsersDAO {
    @Insert
    void insert(com.example.project2.entities.Users users);

    @Query("SELECT * FROM users WHERE username = :username LIMIT 1")
    com.example.project2.entities.Users getUserByUsername(String username);

    @Query("SELECT * FROM users WHERE email = :email LIMIT 1")
    com.example.project2.entities.Users getUserByEmail(String email);

    @Query("SELECT * FROM users WHERE user_id = :user_id LIMIT 1")
    com.example.project2.entities.Users getUserById(int user_id);

    @Query("SELECT * FROM users WHERE is_admin = 1 ORDER BY username")
    List<com.example.project2.entities.Users> getAdmins();

    @Query("DELETE FROM users WHERE is_admin = 0")
    void deleteUsers();

    @Query("SELECT COUNT(*) FROM users")
    int getUserCount();

    @Query("SELECT * FROM users WHERE is_admin = 0 ORDER BY username")
    List<com.example.project2.entities.Users> getUsers();

    @Query("DELETE FROM users WHERE user_id = (:user_id)")
    void deleteUserByID(int user_id);


}
