package com.github.stanislav_milev.server.repo;

import com.github.stanislav_milev.server.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepo extends JpaRepository<Room, Long> {
}
