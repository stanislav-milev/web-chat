package com.github.stanislav_milev.server.repo;

import com.github.stanislav_milev.server.model.Room;
import com.github.stanislav_milev.server.model.RoomRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRoleRepo extends JpaRepository<RoomRole, Long> {
}
