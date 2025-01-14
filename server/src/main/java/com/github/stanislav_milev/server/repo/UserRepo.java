package com.github.stanislav_milev.server.repo;

import com.github.stanislav_milev.server.model.Message;
import com.github.stanislav_milev.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
