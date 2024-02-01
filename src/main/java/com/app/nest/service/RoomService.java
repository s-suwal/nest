package com.app.nest.service;

import com.app.nest.domain.Room;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


public interface RoomService {
    List<Room> getAllRooms() throws IOException;
    Room createRooms(Room room) throws IOException ;
    

}
