package com.example.demo.repository;

import com.example.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

    @Query("SELECT u FROM User u WHERE email = :email AND password = :password")
    User identify(String email, String password);

    @Query("SELECT u FROM User u WHERE id = :idUser")
    User selectById(long idUser);

}
