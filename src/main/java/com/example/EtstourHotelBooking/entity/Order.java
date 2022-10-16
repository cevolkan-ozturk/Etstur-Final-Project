package com.example.EtstourHotelBooking.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "orders")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "order_id")
    private int id;

    @Column (name = "customer_id")
    private int customerId;

    @Column (name = "room_id")
    private int roomId;

    @Column (name = "order_date")
    private Date orderDate;

    @Column (name = "order_status")
    private String orderStatus;

    @Column (name = "order_delivery_date")
    private Date orderDeliveryDate;

    @Column (name = "order_description")
    private String orderDescription;

}
