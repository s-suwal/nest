package com.app.nest.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomType {
	@Id
    private Long typeID;
    private String description;
    private Float pricePerNight;
    private Integer capacity;
}
