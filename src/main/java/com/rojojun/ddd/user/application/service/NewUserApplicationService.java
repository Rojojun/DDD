package com.rojojun.ddd.user.application.service;

import com.rojojun.ddd.user.domain.entity.User;
import com.rojojun.ddd.user.domain.service.UserService;
import com.rojojun.ddd.user.domain.vo.UserId;
import com.rojojun.ddd.user.domain.vo.UserName;
import com.rojojun.ddd.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Transactional
@Service
public class NewUserApplicationService {
    private final UserRepository userRepository;
    private final UserService userService;

    public void createUser(String userId, String userName) {
        User user = new User(
                new UserId(userId),
                new UserName(userName)
        );

        if (userService.exist(user)) {
            throw new RuntimeException("중복 회원");
        }

        userRepository.save(user);
    }
}
