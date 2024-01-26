package com.app.nest.controller;

import com.app.nest.domain.Room;
import com.app.nest.repo.RoomRepository;
import com.app.nest.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    @PostMapping("nest/rooms/save")
    public String createRoom(Room room){

        roomService.createRooms(room);
        return "redirect: rooms";
    }
}
