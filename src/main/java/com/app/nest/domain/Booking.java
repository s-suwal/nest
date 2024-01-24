package com.app.nest.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    private Long bookingID;
    private Long guestID;
    private String roomNumber;
    private Date checkinDate;
    private Date checkOutDate;
    private Float totalPrice;

}
