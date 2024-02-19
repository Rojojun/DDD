package com.rojojun.ddd.user.application.service;

import com.rojojun.ddd.user.domain.entity.User;
import com.rojojun.ddd.user.domain.service.UserService;
import com.rojojun.ddd.user.domain.vo.UserId;
import com.rojojun.ddd.user.domain.vo.UserName;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Transactional
@RequiredArgsConstructor
@Service
public class OldUserApplicationService {
    private final UserService userService;

    private static final String DRIVER = "드라이버_정보";
    private static final String URL = "DB_포트_및_URL";
    private static final String USER = "USER_ID";
    private static final String PW = "USER_PW";

    public void createUser(String userId, String userName) throws SQLException, ClassNotFoundException {
        User user = new User(
                new UserId(userId),
                new UserName(userName)
        );

        if (userService.existQuery(user)) {
            throw new RuntimeException("중복 회원");
        }

        PreparedStatement preparedStatement = connectDataBase().prepareStatement("INSERT INTO users (id, name) VALUES(?, ?)");
        preparedStatement.setString(1, user.getUserId().getId());
        preparedStatement.setString(2, user.getName().getValue());
        preparedStatement.executeUpdate();
    }

    private Connection connectDataBase() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PW);
    }
}
