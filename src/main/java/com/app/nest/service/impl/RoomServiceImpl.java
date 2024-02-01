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

   private RoomRepository roomRepository;

   public RoomServiceImpl(RoomRepository roomRepository){
       this.roomRepository=roomRepository;
   }

    @Override
    public List<Room> getAllRooms() {
       List<Room> room = new ArrayList<>();
       try{
           room = (List<Room>) roomRepository.findAll();
       }catch (Exception e){
            throw new RuntimeException("Something went wrong");}
        return room;
    }

    @Override
    public Room createRooms(Room room) {
       return roomRepository.save(room);
    }
}
