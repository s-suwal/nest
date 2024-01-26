package com.app.nest.service;

import com.app.nest.domain.Room;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RoomService {
    List<Room> getAllRooms();
    List<Room> createRooms(Room room);

}
