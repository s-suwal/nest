package com.app.nest.controller;

import com.app.nest.domain.Room;
import com.app.nest.repo.RoomRepository;
import com.app.nest.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RoomController {
    @Autowired
    RoomService roomService;
    @GetMapping("nest/rooms")
    public String roomInventory(Model model){

        model.addAttribute("aRoom");
        return "rooms";
    }
    
    @PostMapping("/createroom")
    public ResponseEntity<Room> createRoom(@RequestBody Room room){
        try {
            return new ResponseEntity<Room>(roomService.createRooms(room), HttpStatus.CREATED);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
