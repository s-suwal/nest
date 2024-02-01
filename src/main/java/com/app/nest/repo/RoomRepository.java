package com.app.nest.repo;

import com.app.nest.domain.Room;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
@Primary
public interface RoomRepository extends CrudRepository<Room, Long> {
}
