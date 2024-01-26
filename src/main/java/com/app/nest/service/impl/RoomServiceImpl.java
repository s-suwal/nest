package com.app.nest.service.impl;

import com.app.nest.domain.Room;
import com.app.nest.repo.RoomRepository;
import com.app.nest.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomRepository roomRepository;

    @Override
    public List<Room> getAllRooms() {
       List<Room> room = new ArrayList<>();
       try{
           room = roomRepository.findAll();
       }catch (Exception e){
    throw new RuntimeException("Something went wrong");}
        return room;
    }

    @Override
    public List<Room> createRooms(Room room) {
        List<Room> roomList = new ArrayList<>();
        roomList.add(room);
        roomList = (List<Room>) roomRepository.save(room);
        return roomList;
    }
}
