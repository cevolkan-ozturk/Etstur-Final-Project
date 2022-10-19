package com.example.EtstourHotelBooking.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;


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
    private int id;

    @Column(name="customer_identity_no")
    private Long identityNo;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_surname")
    private String customerSurname;

    @Column(name = "customer_phone")
    private long customerPhoneNumber ;

    @Column(name = "address")
    private String address ;

    @Column(name = "room_no")
    private String roomNo;

    //@OneToMany(fetch = FetchType.LAZY)
    //@JoinColumn(name = "customer_id")
    //private Set<Reservation> reservations;


}
