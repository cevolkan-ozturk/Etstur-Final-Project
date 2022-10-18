package com.example.EtstourHotelBooking.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

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
    private int billNo;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_surname")
    private String customerSurname;

    @Column(name = "reservation_price")
    private double price;

    @Column(name = "bill_date")
    private Date billDate;

    @Column(name = "pay_status")
    private String status;

}
