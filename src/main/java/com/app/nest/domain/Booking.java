package com.app.nest.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
	@Id
    private Long bookingID;
    private Long guestID;
    private String roomNumber;
    private Date checkinDate;
    private Date checkOutDate;
    private Float totalPrice;

}
