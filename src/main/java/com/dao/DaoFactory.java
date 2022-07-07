package com.dao;

import java.sql.Connection;

public class DaoFactory {
    private ConnectionMaker connectionMaker(){
        BinaryConnectionMaker binaryConnectionMaker = new BinaryConnectionMaker();
        return binaryConnectionMaker;
    }
    public UserDAO userDao(){
        UserDAO userDao = new UserDAO(connectionMaker());
        return userDao;
    }
}
