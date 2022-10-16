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
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "customer_id")
    private long id;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_phone")
    private long customerPhoneNumber ;

    @Column(name = "address")
    private String address ;

    @Column(name = "room_no")
    private long roomNo;

}
