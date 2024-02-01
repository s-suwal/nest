package com.app.nest.domain;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {

	@Id
    private Long hotelID;
    private String name;
    private String address;
    private String phone;
    private String email;

}
