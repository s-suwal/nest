package com.app.nest.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest {
	
	@Id
    private Long guestID;
    private String guestFirstName;
    private String guestLastName;
    private String email;
    private String address;
    private String phone;
    private Date dateOfBirth;

}
