package com.example.EtstourHotelBooking.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "bill")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Bill {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "bill_no")
    private long billNo;

    @Column(name = "customer_id")
    private long customerId;


}
