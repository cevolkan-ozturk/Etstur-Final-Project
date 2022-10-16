package com.example.EtstourHotelBooking.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

   @Column(name = "room_no")
    private String roomNo;

    @Column(name = "room_floor")
    private Long floor;

    @Column(name = "room_status")
    private String status;

    @Column(name = "room_type")
    private String type;

    @Column(name = "room_description")
    private String description;

    @Column(name = "room_price")
    private BigDecimal price;

    @Column(name = "room_bed_count")
    private int bedCount;

}
