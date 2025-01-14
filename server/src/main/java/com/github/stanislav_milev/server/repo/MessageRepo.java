package com.github.stanislav_milev.server.repo;

import com.github.stanislav_milev.server.model.Message;
import com.github.stanislav_milev.server.model.RoomRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
