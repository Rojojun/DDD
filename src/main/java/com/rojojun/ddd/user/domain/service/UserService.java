package com.rojojun.ddd.user.domain.service;

import com.rojojun.ddd.user.domain.entity.User;
import org.springframework.stereotype.Service;

import java.sql.*;

@Service
public class UserService {
    private static final String DRIVER = "드라이버_정보";
    private static final String URL = "DB_포트_및_URL";
    private static final String USER = "USER_ID";
    private static final String PW = "USER_PW";

    public boolean exist(User user) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = connectDataBase().prepareStatement("SELECT * FROM users WHERE name = ?");
        preparedStatement.setString(1, user.getName().getValue());
        ResultSet reader = preparedStatement.executeQuery();
        return reader.next();
    }

    private Connection connectDataBase() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PW);
    }
}
