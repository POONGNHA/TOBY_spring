package com.dao;

import com.domain.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {
    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {

        //DaoFactory daoFactory = new DaoFactory();
        UserDAO userDao = new DaoFactory().userDao();

        User user = new User();
        user.setId("0");
        user.setName("chanwoo");
        user.setPassword("1235");

        userDao.add(user);

        User result = userDao.get("0");
        System.out.println(result.getId());
        System.out.println(result.getName());
        assertEquals("0",result.getId());
    }

}