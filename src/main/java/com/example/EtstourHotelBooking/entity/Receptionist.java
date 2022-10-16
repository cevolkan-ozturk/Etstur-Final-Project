package com.example.EtstourHotelBooking.entity;


import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "receptionists")
public class Receptionist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "receptionist_id")
    private long id ;

    @Column(name = "receptionist_name")
    private String receptionistName;

    @Column(name = "receptionist_phone")
    private long receptionistPhoneNumber;

    @Column(name = "address")
    private String address;


}
