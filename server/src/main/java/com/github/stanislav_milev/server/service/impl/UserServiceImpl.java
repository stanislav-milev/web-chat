package com.github.stanislav_milev.server.service.impl;

import com.github.stanislav_milev.server.model.User;
import com.github.stanislav_milev.server.repo.UserRepo;
import com.github.stanislav_milev.server.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    @Override
    public User create(User user) {
        log.info("Creating user: {}", user.getName());
        //TODO is created_at set?
        return userRepo.save(user);
    }
}
