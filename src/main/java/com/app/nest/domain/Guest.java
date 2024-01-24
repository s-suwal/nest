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
public class Guest {
    private Long guestID;
    private String guestFirstName;
    private String guestLastName;
    private String email;
    private String address;
    private String phone;
    private Date dateOfBirth;

}
