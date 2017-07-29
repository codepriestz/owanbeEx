package com.codepriest.DAO;

import com.codepriest.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by App Celestine on 7/27/2017.
 */
public interface UserDao extends JpaRepository<User, Integer> {
    @Query("select u from User where u.email=?1 and u.password=?2")
    User findBy(String email, String password);

}
