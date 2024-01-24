package com.app.nest.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    private String roomNumber;
    private Long hotelID;
    private String typeID;
    private String status;
}
