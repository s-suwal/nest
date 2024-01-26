package com.app.nest.repo;

import com.app.nest.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
